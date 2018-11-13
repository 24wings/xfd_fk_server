package com.fastsun.xfd.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.fastsun.Q;
import com.fastsun.framework.bean.*;
import com.fastsun.framework.bean.http.*;
import com.fastsun.framework.entity.rbac.Menu;
import com.fastsun.framework.entity.rbac.Role;
import com.fastsun.framework.entity.rbac.User;
import com.fastsun.framework.service.STQService;
import com.fastsun.xfd.entity.Member;
import com.fastsun.xfd.entity.MemberGroup;
import com.fastsun.xfd.service.MemberJpa;
import com.fastsun.xfd.service.MemberGroupJpa;
import com.fastsun.xfd.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XfdController {
    @Autowired
    STQService stq;
    @PersistenceContext
    protected EntityManager entityManager;
    @Autowired
    MemberService memberService;
    @Autowired
    MemberJpa memberJpa;
    @Autowired
    MemberGroupJpa memberGroupJpa;

    @PostMapping("/xfd/user/login")
    public Res login(@RequestBody LoginBean loginBean) {
        User user = stq.findOne(Q.one().$like("userName", loginBean.getUserName()).getQueryParam(), User.class);
        Member member = (Member) stq.findOne(Q.one().$like("mobile", loginBean.getUserName()).getQueryParam(),
                Member.class);
        Role role = new Role();
        if (user != null && user.getPassword().equals(loginBean.getPassword())) {
            List<Menu> menus = new ArrayList<>();
            if (user != null) {
                role = stq.findOne(Q.all().$eq("roleId", Integer.parseInt(user.getRoleIds())).getQueryParam(),
                        Role.class);
            }
            menus = stq.find(Q.all().$in("menuId", "(" + role.getMenuIds() + ")").getQueryParam(), Menu.class);
            return Res.success().put("employee", user).put("member", member).put("roles", role).put("menus", menus);
        } else {
            return Res.error(400, "密码错误");
        }
    }

    @PostMapping("/xfd_fk/member/create")
    public Res memberCreate(@RequestBody Member member) {
        boolean flag = memberService.memberCreate(member);
        if (!flag) {
            return Res.error(400, "卡号已经注册");
        }
        return Res.success();
    }

    @PostMapping("/xfd_fk/disabledCard")
    public Res disabledCard(@RequestBody Member member) {
        boolean flag = memberService.disabledCard(member);
        if (!flag) {
            return Res.error(400, "该卡已被禁用！");
        }
        return Res.success();

    }

    @PostMapping("/xfd_fk/reset")
    public Res reset(@RequestBody Member member, @RequestParam String actorName) {
        MemberGroup group = memberGroupJpa.findById(member.getGroupId());
        if (group.getMonthMoney().compareTo(new BigDecimal(0)) == 0) {
            return Res.error(400, "每月限额为0不允许重置");
        } else {
            this.memberService.createClearOrder(member, member.getAmount(), actorName);
            this.memberService.createRechargeOrder(member, group.getMonthMoney(), actorName);
            member.setAmount(group.getMonthMoney());
            this.memberJpa.save(member);
            return Res.success();
        }

    }

    @PostMapping("/xfd_fk/recharge")
    public Res recharge(@RequestParam BigDecimal amount, @RequestBody Member member, @RequestParam String actorName) {
        Member dbMember = memberJpa.findById(member.getId());

        if (dbMember != null) {
            MemberGroup group = memberGroupJpa.findById(dbMember.getGroupId());
            if (group != null) {
                // 如果充值金额大于 月额,返回禁止错误
                if (group.getMonthMoney().compareTo(amount) < 0
                        && group.getMonthMoney().compareTo(new BigDecimal(0)) != 0) {
                    return Res.error(400, "充值金额不得大于会员每月金额");
                }
                Member newmember = memberService.recharge(dbMember, amount, actorName);
                if (newmember != null) {
                    return Res.success().put("member", newmember);
                }
                return Res.error(400, "充值失败！");
            } else {
                return Res.error(400, "会员分组不存在");
            }
        } else {
            return Res.error(400, "不存在");
        }
    }

    @PostMapping("/xfd_fk/recharge-all")
    public Res rechargeAll(@RequestParam BigDecimal amount, @RequestParam String actorName) {
        this.memberService.rechargeAll(actorName);
        return Res.success();
    }

    @PostMapping("/xfd_fk/order/summary")
    public Res orderSummary(String className, @RequestBody List<Summary> summarys) throws ClassNotFoundException {
        List list = this.stq.summary(summarys, Class.forName(className));
        return Res.success().put("ok", list);
    }
}