package com.fastsun.hk.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fastsun.hk.enums.OrderStatusEnum;

@Entity()
public class Order {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /** 订单号:前缀+年月日+6位流水号A20180101000001 */
    @Column(nullable = true)
    private String orderNo;
    @Column()
    private String productCode;
    /** 产品名称 */
    @Column()
    private String productName;
    /** 去程航班号 */
    @Column()
    private String boundFlightCode;
    @Column()
    private Integer boundFlightId;
    /** 去程日期 */
    @Column()
    private Date boundDate;
    /** 返程航班 */
    @Column()
    private String returnFlightCode;
    @Column()
    private Integer returnFlightId;
    @Column(nullable = true)
    private String saleRuler;
    /** 返程日期 */
    @Column()
    private Date returnDate;
    @Column()
    /** 行程信息 */
    private String tripInfo;
    /** 成人价 */
    @Column()
    private BigDecimal price2B_a;
    @Column()
    private BigDecimal price2B_c;
    // @Column('decimal')
    // price_a: number;
    /** 儿童价 */
    // @Column('decimal')
    // price_c: number;
    /** 成人数 */
    @Column()
    private Integer count_a;
    /** 儿童数 */
    @Column()
    private Integer count_c;
    /** 订单金额 */
    @Column()
    private BigDecimal amount;
    /** 订单状态 */
    @Column()
    private OrderStatusEnum status;
    @Column()
    private Integer memberId;
    @Column()
    private String remark;
    @Column()
    private String memberName;
    @Column()
    private Integer startCityId;
    @Column()
    private String startCityName;
    @Column(nullable = true)
    private Integer stopCityId;
    @Column(nullable = true)
    private String stopCityName;
    @Column()
    private Integer endCityId;
    @Column()
    private String endCityName;
    @Column(nullable = true)
    private String drawerTimeLimit;
    @Column(nullable = true)
    private String refoundRule;
    @Column(nullable = true)
    private Integer unionCityId;
    @Column(nullable = true)
    private String unionCityName;
    @Column(nullable = true)
    private Integer masterUserId;
    @Column(nullable = true)
    private Date lastUpdateTime = new Date();
    @Column(nullable = true)
    private Date createTime = new Date();
    @Column(nullable = true)
    private Integer tripDays;

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
     * @return the boundFlightId
     */
    public Integer getBoundFlightId() {
        return boundFlightId;
    }

    /**
     * @param boundFlightId the boundFlightId to set
     */
    public void setBoundFlightId(Integer boundFlightId) {
        this.boundFlightId = boundFlightId;
    }

    /**
     * @return the count_a
     */
    public Integer getCount_a() {
        return count_a;
    }

    /**
     * @param count_a the count_a to set
     */
    public void setCount_a(Integer count_a) {
        this.count_a = count_a;
    }

    /**
     * @return the count_c
     */
    public Integer getCount_c() {
        return count_c;
    }

    /**
     * @param count_c the count_c to set
     */
    public void setCount_c(Integer count_c) {
        this.count_c = count_c;
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
     * @return the drawerTimeLimit
     */
    public String getDrawerTimeLimit() {
        return drawerTimeLimit;
    }

    /**
     * @param drawerTimeLimit the drawerTimeLimit to set
     */
    public void setDrawerTimeLimit(String drawerTimeLimit) {
        this.drawerTimeLimit = drawerTimeLimit;
    }

    /**
     * @return the endCityId
     */
    public Integer getEndCityId() {
        return endCityId;
    }

    /**
     * @param endCityId the endCityId to set
     */
    public void setEndCityId(Integer endCityId) {
        this.endCityId = endCityId;
    }

    /**
     * @return the endCityName
     */
    public String getEndCityName() {
        return endCityName;
    }

    /**
     * @param endCityName the endCityName to set
     */
    public void setEndCityName(String endCityName) {
        this.endCityName = endCityName;
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
     * @return the lastUpdateTime
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * @param lastUpdateTime the lastUpdateTime to set
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * @return the masterUserId
     */
    public Integer getMasterUserId() {
        return masterUserId;
    }

    /**
     * @param masterUserId the masterUserId to set
     */
    public void setMasterUserId(Integer masterUserId) {
        this.masterUserId = masterUserId;
    }

    /**
     * @return the memberId
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * @param memberId the memberId to set
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * @return the memberName
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * @param memberName the memberName to set
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
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
     * @return the price2B_a
     */
    public BigDecimal getPrice2B_a() {
        return price2B_a;
    }

    /**
     * @param price2b_a the price2B_a to set
     */
    public void setPrice2B_a(BigDecimal price2b_a) {
        price2B_a = price2b_a;
    }

    /**
     * @return the price2B_c
     */
    public BigDecimal getPrice2B_c() {
        return price2B_c;
    }

    /**
     * @return the productCode
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * @param price2b_c the price2B_c to set
     */
    public void setPrice2B_c(BigDecimal price2b_c) {
        price2B_c = price2b_c;
    }

    /**
     * @param productCode the productCode to set
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @return the refoundRule
     */
    public String getRefoundRule() {
        return refoundRule;
    }

    /**
     * @param refoundRule the refoundRule to set
     */
    public void setRefoundRule(String refoundRule) {
        this.refoundRule = refoundRule;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @return the returnDate
     */
    public Date getReturnDate() {
        return returnDate;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return the returnFlightCode
     */
    public String getReturnFlightCode() {
        return returnFlightCode;
    }

    /**
     * @param returnDate the returnDate to set
     */
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * @return the returnFlightId
     */
    public Integer getReturnFlightId() {
        return returnFlightId;
    }

    /**
     * @param returnFlightCode the returnFlightCode to set
     */
    public void setReturnFlightCode(String returnFlightCode) {
        this.returnFlightCode = returnFlightCode;
    }

    /**
     * @param returnFlightId the returnFlightId to set
     */
    public void setReturnFlightId(Integer returnFlightId) {
        this.returnFlightId = returnFlightId;
    }

    /**
     * @return the saleRuler
     */
    public String getSaleRuler() {
        return saleRuler;
    }

    /**
     * @param saleRuler the saleRuler to set
     */
    public void setSaleRuler(String saleRuler) {
        this.saleRuler = saleRuler;
    }

    /**
     * @return the startCityId
     */
    public Integer getStartCityId() {
        return startCityId;
    }

    /**
     * @param startCityId the startCityId to set
     */
    public void setStartCityId(Integer startCityId) {
        this.startCityId = startCityId;
    }

    /**
     * @return the startCityName
     */
    public String getStartCityName() {
        return startCityName;
    }

    /**
     * @param startCityName the startCityName to set
     */
    public void setStartCityName(String startCityName) {
        this.startCityName = startCityName;
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
     * @return the stopCityId
     */
    public Integer getStopCityId() {
        return stopCityId;
    }

    /**
     * @param stopCityId the stopCityId to set
     */
    public void setStopCityId(Integer stopCityId) {
        this.stopCityId = stopCityId;
    }

    /**
     * @return the stopCityName
     */
    public String getStopCityName() {
        return stopCityName;
    }

    /**
     * @return the tripDays
     */
    public Integer getTripDays() {
        return tripDays;
    }

    /**
     * @param stopCityName the stopCityName to set
     */
    public void setStopCityName(String stopCityName) {
        this.stopCityName = stopCityName;
    }

    /**
     * @param tripDays the tripDays to set
     */
    public void setTripDays(Integer tripDays) {
        this.tripDays = tripDays;
    }

    /**
     * @return the tripInfo
     */
    public String getTripInfo() {
        return tripInfo;
    }

    /**
     * @return the unionCityId
     */
    public Integer getUnionCityId() {
        return unionCityId;
    }

    /**
     * @param tripInfo the tripInfo to set
     */
    public void setTripInfo(String tripInfo) {
        this.tripInfo = tripInfo;
    }

    /**
     * @param unionCityId the unionCityId to set
     */
    public void setUnionCityId(Integer unionCityId) {
        this.unionCityId = unionCityId;
    }

    /**
     * @return the unionCityName
     */
    public String getUnionCityName() {
        return unionCityName;
    }

    /**
     * @param unionCityName the unionCityName to set
     */
    public void setUnionCityName(String unionCityName) {
        this.unionCityName = unionCityName;
    }
}