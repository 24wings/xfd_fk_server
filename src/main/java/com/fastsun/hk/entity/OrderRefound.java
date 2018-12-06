package com.fastsun.hk.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fastsun.hk.enums.OrderRefoundStatusEnum;

@Entity()
public class OrderRefound {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column()
    private String refundNo;
    // @Column()
    // title: "退票单号"
    @Column()
    private Integer orderId;
    @Column(nullable = true)
    private String orderNo;
    @Column(nullable = true)
    private Integer productId;
    @Column()
    private String productCode;
    @Column()
    private String boundFlightCode;
    @Column()
    private Date boundDate;
    @Column()
    private String returnFlightCode;
    @Column()
    private Date returnDate;
    @Column(nullable = true)
    private String tripInfo;

    @Column()
    private Integer refundcount_a;
    @Column()
    private Integer refundcount_c;
    @Column()
    private BigDecimal amount;
    @Column(nullable = true)
    private BigDecimal refund_amt;
    @Column(nullable = true)
    private BigDecimal supplier_amt;

    @Column()
    private OrderRefoundStatusEnum status;
    @Column()
    private String remark;
    @Column()
    private Date createTime = new Date();

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
     * @return the boundDate
     */
    public Date getBoundDate() {
        return boundDate;
    }

    /**
     * @param boundDate the boundDate to set
     */
    public void setBoundDate(Date boundDate) {
        this.boundDate = boundDate;
    }

    /**
     * @return the boundFlightCode
     */
    public String getBoundFlightCode() {
        return boundFlightCode;
    }

    /**
     * @param boundFlightCode the boundFlightCode to set
     */
    public void setBoundFlightCode(String boundFlightCode) {
        this.boundFlightCode = boundFlightCode;
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
     * @return the orderId
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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
     * @return the productCode
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * @param productCode the productCode to set
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * @return the productId
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * @return the refundNo
     */
    public String getRefundNo() {
        return refundNo;
    }

    /**
     * @param refundNo the refundNo to set
     */
    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    /**
     * @return the refund_amt
     */
    public BigDecimal getRefund_amt() {
        return refund_amt;
    }

    /**
     * @param refund_amt the refund_amt to set
     */
    public void setRefund_amt(BigDecimal refund_amt) {
        this.refund_amt = refund_amt;
    }

    /**
     * @return the refundcount_a
     */
    public Integer getRefundcount_a() {
        return refundcount_a;
    }

    /**
     * @param refundcount_a the refundcount_a to set
     */
    public void setRefundcount_a(Integer refundcount_a) {
        this.refundcount_a = refundcount_a;
    }

    /**
     * @return the refundcount_c
     */
    public Integer getRefundcount_c() {
        return refundcount_c;
    }

    /**
     * @param refundcount_c the refundcount_c to set
     */
    public void setRefundcount_c(Integer refundcount_c) {
        this.refundcount_c = refundcount_c;
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
     * @return the returnDate
     */
    public Date getReturnDate() {
        return returnDate;
    }

    /**
     * @param returnDate the returnDate to set
     */
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * @return the returnFlightCode
     */
    public String getReturnFlightCode() {
        return returnFlightCode;
    }

    /**
     * @param returnFlightCode the returnFlightCode to set
     */
    public void setReturnFlightCode(String returnFlightCode) {
        this.returnFlightCode = returnFlightCode;
    }

    /**
     * @return the status
     */
    public OrderRefoundStatusEnum getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(OrderRefoundStatusEnum status) {
        this.status = status;
    }

    /**
     * @return the supplier_amt
     */
    public BigDecimal getSupplier_amt() {
        return supplier_amt;
    }

    /**
     * @param supplier_amt the supplier_amt to set
     */
    public void setSupplier_amt(BigDecimal supplier_amt) {
        this.supplier_amt = supplier_amt;
    }

    /**
     * @return the tripInfo
     */
    public String getTripInfo() {
        return tripInfo;
    }

    /**
     * @param tripInfo the tripInfo to set
     */
    public void setTripInfo(String tripInfo) {
        this.tripInfo = tripInfo;
    }

}