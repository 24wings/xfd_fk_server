package com.fastsun.xfd.bean;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AppMember {
    private Integer id; // id

    private String merchNo; // 商户号

    private String merchName; // 商户名

    private String merchPhone; // 手机号
    @JsonFormat(timezone = "GMT+8")
    private Date creaeTime; // 创建时间

    private String remark; // 备注

    private BigDecimal balance; // 余额

    private String cardNo; // 卡号

    /**
     * @return the balance
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * @return the cardNo
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * @param cardNo the cardNo to set
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * @return the creaeTime
     */
    public Date getCreaeTime() {
        return creaeTime;
    }

    /**
     * @param creaeTime the creaeTime to set
     */
    public void setCreaeTime(Date creaeTime) {
        this.creaeTime = creaeTime;
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
     * @return the merchName
     */
    public String getMerchName() {
        return merchName;
    }

    /**
     * @return the merchNo
     */
    public String getMerchNo() {
        return merchNo;
    }

    /**
     * @param merchName the merchName to set
     */
    public void setMerchName(String merchName) {
        this.merchName = merchName;
    }

    /**
     * @return the merchPhone
     */
    public String getMerchPhone() {
        return merchPhone;
    }

    /**
     * @param merchNo the merchNo to set
     */
    public void setMerchNo(String merchNo) {
        this.merchNo = merchNo;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param merchPhone the merchPhone to set
     */
    public void setMerchPhone(String merchPhone) {
        this.merchPhone = merchPhone;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}