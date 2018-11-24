package com.fastsun.xfd.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fastsun.xfd.entity.enums.OrderStatusEnum;
import com.fastsun.xfd.entity.enums.OrderType;

@Entity()
@Table(name = "b_order")
public class Order {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column()
    private String orderNo; // 订单号
    private String buyMerchCode; // 买方商家编号
    private String buyMerchName; // 买方商家姓名
    private String operatorNo; // 操作员编号
    private String operatorName; // 操作员姓名
    private OrderStatusEnum status; // 订单状态
    @JsonFormat(timezone = "GMT+8")
    private Date createTime = new Date();// 创建时间
    @JsonFormat(timezone = "GMT+8")
    private Date actTime = new Date();// 结算时间
    private BigDecimal amount;
    private String remark;
    private BigDecimal beforeAmount;
    private BigDecimal afterAmount;
    private OrderType orderType;
    private String cardNo;

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
     * @return the orderType
     */
    public OrderType getOrderType() {
        return orderType;
    }

    /**
     * @param orderType the orderType to set
     */
    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    /**
     * @return the afterAmount
     */
    public BigDecimal getAfterAmount() {
        return afterAmount;
    }

    /**
     * @param afterAmount the afterAmount to set
     */
    public void setAfterAmount(BigDecimal afterAmount) {
        this.afterAmount = afterAmount;
    }

    /**
     * @return the beforeAmount
     */
    public BigDecimal getBeforeAmount() {
        return beforeAmount;
    }

    /**
     * @param beforeAmount the beforeAmount to set
     */
    public void setBeforeAmount(BigDecimal beforeAmount) {
        this.beforeAmount = beforeAmount;
    }

    /**
     * @return the actTime
     */
    public Date getActTime() {
        return actTime;
    }

    /**
     * @param actTime the actTime to set
     */
    public void setActTime(Date actTime) {
        this.actTime = actTime;
    }

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
     * @return the buyMerchCode
     */
    public String getBuyMerchCode() {
        return buyMerchCode;
    }

    /**
     * @param buyMerchCode the buyMerchCode to set
     */
    public void setBuyMerchCode(String buyMerchCode) {
        this.buyMerchCode = buyMerchCode;
    }

    /**
     * @return the buyMerchName
     */
    public String getBuyMerchName() {
        return buyMerchName;
    }

    /**
     * @param buyMerchName the buyMerchName to set
     */
    public void setBuyMerchName(String buyMerchName) {
        this.buyMerchName = buyMerchName;
    }

    /**
     * @return the createTime
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")

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
     * @return the operatorName
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * @param operatorName the operatorName to set
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return the status
     */
    public OrderStatusEnum getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(OrderStatusEnum status) {
        this.status = status;
    }

    /**
     * @return the operatorNo
     */
    public String getOperatorNo() {
        return operatorNo;
    }

    /**
     * @param operatorNo the operatorNo to set
     */
    public void setOperatorNo(String operatorNo) {
        this.operatorNo = operatorNo;
    }

    /**
     * @return the orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo the orderNo to set
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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

}
