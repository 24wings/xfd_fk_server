package com.fastsun.xfd.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.fastsun.framework.bean.*;
import com.fastsun.framework.bean.http.*;
import com.fastsun.framework.entity.rbac.User;
import com.fastsun.framework.service.NoService;
import com.fastsun.framework.service.STQService;
import com.fastsun.xfd.bean.AppMember;
import com.fastsun.xfd.bean.CardRequest;
import com.fastsun.xfd.bean.RequestOrder;
import com.fastsun.xfd.entity.Member;
import com.fastsun.xfd.entity.Order;
import com.fastsun.xfd.entity.enums.OrderType;
import com.fastsun.xfd.service.MemberJpa;
import com.fastsun.xfd.service.MemberService;
import com.fastsun.xfd.service.UserJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XfdAppController {
    @Autowired
    STQService stq;
    @PersistenceContext
    protected EntityManager entityManager;
    @Autowired
    MemberService memberService;
    @Autowired
    UserJpa userJpa;
    @Autowired
    private MemberJpa memberJpa;
    @Autowired
    private NoService noService;

    @PostMapping("/auth/app/login")
    public Res login(@RequestBody LoginBean loginBean) {
        User user = userJpa.findFirstByUserName(loginBean.getUserName());
        if (user == null) {
            return Res.error(404, "找不到用户");
        }
        if (user.getPassword().equals(loginBean.getPassword())) {
            user.setStatus(null);
            return Res.success().put("employee", user).put("token", "123");
        } else {
            return Res.error(404, "密码错误");
        }

    }

    @RequestMapping(value = "/api/order/trans", method = RequestMethod.POST)
    public Res createTrans(@RequestBody RequestOrder orderRequest) {
        User actor = userJpa.findById(orderRequest.getUserId());
        Member member = memberJpa.findById(orderRequest.getBuyMerchId());
        if (actor != null && member != null) {
            Order order = new Order();
            String orderNo = String.format("%5d", this.noService.getNo("orderNo"));
            order.setOrderNo(orderNo);
            order.setAmount(orderRequest.getAmount());
            order.setBuyMerchCode(member.getCode());
            order.setOperatorNo(actor.getUserName());
            order.setOperatorName(actor.getName());
            order.setActTime(new Date());
            order.setBeforeAmount(member.getAmount());
            order.setBuyMerchName(member.getName());
            order.setCardNo(orderRequest.getCardNo());
            order.setAfterAmount(member.getAmount().subtract(orderRequest.getAmount()));
            order.setOrderType(OrderType.TRANS);
            order.setCreateTime(new Date());
            order.setOperatorName(member.getName());
            this.stq.save(order);
            member.setAmount(member.getAmount().subtract(orderRequest.getAmount()));
            this.stq.update(member);
            return Res.success();// .put("order", order);
        } else {
            return Res.error(404, "找不到会员或卡号");
        }

    }

    // @ApiOperation(value = "查找", notes = "", httpMethod = "POST")
    @RequestMapping(value = "/api/account/find", method = RequestMethod.POST)
    public Res findAccount(@RequestBody CardRequest card) {
        Member member = memberJpa.findByMealCardNo(card.getCardNo());
        if (member != null) {
            AppMember appMember = new AppMember();
            appMember.setBalance(member.getAmount());
            appMember.setCardNo(member.getMealCardNo());
            appMember.setCreaeTime(new Date());
            appMember.setId(member.getId());
            appMember.setMerchName(member.getName());
            appMember.setRemark(member.getRemark());
            appMember.setMerchNo(member.getCode());
            appMember.setMerchPhone(member.getMobile());
            return Res.success().put("account", appMember);
        } else {
            return Res.error(400, "找不到会员");
        }
    }
}