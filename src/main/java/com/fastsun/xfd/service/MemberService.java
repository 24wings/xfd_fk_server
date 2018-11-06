package com.fastsun.xfd.service;

import java.math.BigDecimal;
import java.util.Date;
// import java.util.List;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.fastsun.Q;
import com.fastsun.framework.bean.http.QueryParam;
import com.fastsun.framework.service.NoService;
import com.fastsun.framework.service.STQService;
import com.fastsun.xfd.entity.Card;
import com.fastsun.xfd.entity.Member;
import com.fastsun.xfd.entity.MemberGroup;
import com.fastsun.xfd.entity.Order;
import com.fastsun.xfd.entity.ResetRecord;
import com.fastsun.xfd.entity.enums.CardStatusEnum;
import com.fastsun.xfd.entity.enums.MemberStatusEnum;
import com.fastsun.xfd.entity.enums.OrderStatusEnum;
import com.fastsun.xfd.entity.enums.OrderType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    UserJpa userJpa;
    @PersistenceContext
    protected EntityManager entityManager;

    @Autowired
    private STQService stqService;

    @Autowired
    private MemberJpa memberJpa;

    @Autowired
    private NoService noService;

    public boolean memberCreate(Member member) {
        String mobile = member.getMobile();
        Member memberExisit = this.stqService.findOne(Q.one().$eq("mobile", mobile), Member.class);
        Card cardExisit = this.stqService.findOne(Q.one().$eq("cardNo", member.getMealCardNo()), Card.class);
        if (memberExisit != null) {
            return false;
        } else {
            if (cardExisit != null) {
                return false;
            } else {
                String memberCode = String.format("%05d", this.noService.getNo("memberCode"));
                member.setCode(memberCode);
                this.stqService.save(member);
                Card card = new Card();
                card.setCardNo(member.getMealCardNo());
                card.setCardStatus(CardStatusEnum.Enable);
                card.setMerchNo(memberCode);
                this.stqService.save(card);
                return true;
            }
        }

    }

    public boolean disabledCard(Member member) {
        Card card = this.stqService.findOne(
                Q.one().$eq("merchNo", member.getCode()).$eq("cardStatus", CardStatusEnum.Enable.toString()),
                Card.class);
        if (card != null) {
            card.setCardStatus(CardStatusEnum.Disabled);
            this.stqService.save(card);
            return true;
        }
        return false;
    }

    public Member recharge(Member member, BigDecimal amount, String actorName) {
        if (member != null) {
            Order clearOrder = this.createClearOrder(member, new BigDecimal(0).subtract(member.getAmount()), actorName);
            Order rechargeOrder = this.createRechargeOrder(member, amount, actorName);
            this.stqService.save(clearOrder);
            this.stqService.save(rechargeOrder);
            member.setAmount(amount);
            this.stqService.save(member);
            return member;
        }
        return null;
    }

    @Transactional
    public Boolean rechargeAll(String actorName) {
        List<MemberGroup> groups = this.stqService.find(new QueryParam(), MemberGroup.class);
        List<Member> members = memberJpa.findByMemberStatusEquals(MemberStatusEnum.Enable);
        for (int i = 0; i < members.size(); i++) {
            Member member = members.get(i);
            BigDecimal monthMoney = new BigDecimal(0);
            for (int j = 0; j < groups.size(); j++) {
                if (groups.get(j).getId() == member.getGroupId()) {
                    monthMoney = groups.get(j).getMonthMoney();
                }
            }

            BigDecimal debtMoney = monthMoney;
            Order clearOrder = this.createClearOrder(member, debtMoney, actorName);
            this.stqService.save(clearOrder);
            member.setAmount(new BigDecimal(0));
            BigDecimal rechargeMoney = monthMoney.subtract(member.getAmount());
            Order rechargeOrder = this.createRechargeOrder(member, rechargeMoney, actorName);
            member.setAmount(monthMoney);
            this.stqService.save(member);
            this.stqService.save(rechargeOrder);
        }
        ResetRecord resetRecord = new ResetRecord();
        resetRecord.setOperatorName(actorName);
        resetRecord.setCreateTime(new Date());
        this.stqService.save(resetRecord);
        return true;
    }

    /** 创建充值订单 */
    private Order createRechargeOrder(Member member, BigDecimal amount, String actorName) {
        Order order = new Order();
        order.setAmount(amount);
        order.setBuyMerchCode(member.getCode());
        order.setBuyMerchName(member.getName());
        String orderNo = String.format("%5d", this.noService.getNo("orderNo"));
        order.setOrderNo(orderNo);
        order.setCardNo(member.getMealCardNo());
        order.setBeforeAmount(member.getAmount());
        order.setAfterAmount(amount);
        order.setStatus(OrderStatusEnum.CONFIRMED);
        order.setRemark(member.getRemark());
        order.setOrderType(OrderType.RECHARGE);
        order.setOperatorName(actorName);
        return order;
    }

    /** 创建清零订单 */
    private Order createClearOrder(Member member, BigDecimal amount, String actorName) {
        Order order = new Order();
        order.setOperatorName(actorName);
        order.setBuyMerchCode(member.getCode());
        order.setBuyMerchName(member.getName());
        String orderNo = String.format("%5d", this.noService.getNo("orderNo"));
        order.setOrderNo(orderNo);
        order.setAmount(amount);
        order.setCardNo(member.getMealCardNo());
        order.setBeforeAmount(member.getAmount());
        order.setAfterAmount(new BigDecimal(0));
        order.setRemark(member.getRemark());
        order.setStatus(OrderStatusEnum.CONFIRMED);
        order.setOrderType(OrderType.CLEAR);
        order.setOperatorName(actorName);
        return order;
    }

    /** 创建重置记录 */
    private ResetRecord createResetRecord() {

        return null;
    }

    // @Transactional
    // public boolean createTrans(Member member, BigDecimal debtMoney, String
    // actorName) {
    // Order order = new Order();
    // order.setOperatorName(actorName);
    // order.setBuyMerchCode(member.getCode());
    // order.setBuyMerchName(member.getName());
    // String orderNo = String.format("%5d", this.noService.getNo("orderNo"));
    // order.setOrderNo(orderNo);
    // order.setCardNo(member.getMealCardNo());
    // order.setBeforeAmount(member.getAmount());
    // order.setAfterAmount(new BigDecimal(0));
    // order.setRemark(member.getRemark());
    // order.setOrderType(OrderType.RECHARGE);
    // order.setOperatorName(actorName);
    // member.setAmount(new BigDecimal(0));
    // return false;
    // }

}