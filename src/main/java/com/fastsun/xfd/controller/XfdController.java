package com.fastsun.xfd.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
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
import com.fastsun.xfd.entity.DailyStatistics;
import com.fastsun.xfd.entity.Member;
import com.fastsun.xfd.entity.MemberGroup;
import com.fastsun.xfd.service.MemberJpa;
import com.fastsun.xfd.service.DailyStatisticsJpa;
import com.fastsun.xfd.service.MemberGroupJpa;
import com.fastsun.xfd.service.MemberService;
import com.fastsun.xfd.service.UserJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    @Autowired
    UserJpa userJpa;
    @Autowired()
    DailyStatisticsJpa dailyStatisticsJpa;

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
            return Res.error(400, "卡号或手机号已经注册");
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
            memberService.recharge(member, amount, actorName);
            // dbMember.setAmount(dbMember.getAmount().add(amount));
            // memberJpa.save(dbMember);
            return Res.success();
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

    @PostMapping("/xfd_fk/user/modify")
    public Res modifyUserInfo(@RequestBody User user) {
        User dbUser = userJpa.findById(user.getId());
        if (dbUser != null) {
            dbUser.setName(user.getName());
            dbUser.setPassword(user.getPassword());
            userJpa.save(dbUser);
            return Res.success();
        } else {
            return Res.error(400, "找不到用户");
        }

    }

    // @GetMapping("/xfd_fk/user/diary")
    // public Res dailyAnalysis() {
    // List<Member> members = memberJpa.findAll();
    // members.forEach(member -> {
    // System.out.println(member);
    // DailyStatistics daily = new DailyStatistics();
    // daily.setAccountAmount(member.getAmount());
    // daily.setDate(new Date());
    // daily.setMemberId(member.getId());
    // dailyStatisticsJpa.save(daily);
    // });
    // return Res.success();
    // }
}