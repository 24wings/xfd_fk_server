package com.fastsun.hk.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import com.fastsun.framework.entity.rbac.User;
import com.fastsun.hk.enums.AuditStatusEnum;
import com.fastsun.hk.enums.MemberTypeEnum;

/**
 * @author liaoweimin
 * @version 1.0
 * @created 2018/9/22 11:19:13
 */
/** 会员信息 */
@Entity()
public class Member {
    /** 会员Id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /** 代码（前缀+会员流水号,前缀:供应商S，采购商B，个人C，流水号8位) */
    @Column()
    private String code;
    @Column()
    private String orgName;
    /** 名称 */
    @Column(unique = true)
    private String name;
    /** 手机号(用来收验证码) */
    @Column(unique = true)
    private String mobile;
    /** 负责人姓名 */
    // @Column({ nullable: true })
    // principal: string;
    /** 联系地址 */
    @Column()
    private String address;
    /** 银行账号 */
    @Column()
    private String bankInfo;
    /** 企业税号 */
    // @Column()
    // taxCode: string;
    /** 会员类型 */
    @Column()
    private MemberTypeEnum memberType;
    /** 审核状态 */
    @Column()
    private AuditStatusEnum memberStatus;
    @OneToOne()
    private User user;
    /** 前端字段 */
    @Transient
    private String password;
    /** 前端字段 */
    private Integer orgId;
    // user?: any;
    @Column()
    private Integer userId;
    private String authcode;
    @Column()
    private Date createTime;

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the authcode
     */
    public String getAuthcode() {
        return authcode;
    }

    /**
     * @param authcode the authcode to set
     */
    public void setAuthcode(String authcode) {
        this.authcode = authcode;
    }

    /**
     * @return the bankInfo
     */
    public String getBankInfo() {
        return bankInfo;
    }

    /**
     * @param bankInfo the bankInfo to set
     */
    public void setBankInfo(String bankInfo) {
        this.bankInfo = bankInfo;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime the createTime to set
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the memberStatus
     */
    public AuditStatusEnum getMemberStatus() {
        return memberStatus;
    }

    /**
     * @param memberStatus the memberStatus to set
     */
    public void setMemberStatus(AuditStatusEnum memberStatus) {
        this.memberStatus = memberStatus;
    }

    /**
     * @return the memberType
     */
    public MemberTypeEnum getMemberType() {
        return memberType;
    }

    /**
     * @param memberType the memberType to set
     */
    public void setMemberType(MemberTypeEnum memberType) {
        this.memberType = memberType;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the orgId
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * @param orgId the orgId to set
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * @return the orgName
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * @param orgName the orgName to set
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}