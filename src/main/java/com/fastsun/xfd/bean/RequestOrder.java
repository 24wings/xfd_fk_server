package com.fastsun.xfd.bean;

import java.math.BigDecimal;
import java.util.Date;

public class RequestOrder {
    private Integer id;

    private Integer buyMerchId; // 买方商家编号

    private String cardNo; // 卡号

    private Integer userId; // 操作员id

    private String userName; // 操作员姓名
    private BigDecimal amount; // 发生额

    /**
     * @return the amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * @return the buyMerchId
     */
    public Integer getBuyMerchId() {
        return buyMerchId;
    }

    /**
     * @param buyMerchId the buyMerchId to set
     */
    public void setBuyMerchId(Integer buyMerchId) {
        this.buyMerchId = buyMerchId;
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

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
}