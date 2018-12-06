package com.fastsun.hk.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fastsun.hk.enums.AuditStatusEnum;
import com.fastsun.hk.enums.ProductTargetEnum;
import com.fastsun.hk.enums.ProductTypeEnum;
import com.fastsun.hk.enums.SellTypeEnum;

/** 产品信息 */
@Entity()
public class Product extends BaseAduitEntity {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /** 产品代码(出发地+到达地+航司2字代码+4位流水号 例:WUHBKKCZ0001) */
    @Column()
    private String code;
    /** 产品名称 */
    @Column()
    private String name;
    /** 产品宣传图片文件名 */
    @Column(nullable = true)
    private String image;
    @Column(nullable = true)
    /** 国内航线 */
    private Boolean isDomesticLine;
    /** 产品类别 */
    @Column()
    ProductTypeEnum productType;
    /** 销售方式 */
    @Column()
    SellTypeEnum sellType;
    @Column(nullable = true)
    private String drawerTimeLimit;
    @Column(nullable = true)
    private String refoundRule;
    /** 去程航班 */
    @ManyToOne()
    @JoinColumn()
    private Flight boundFlight;
    /** 回程航班 */
    // @Index({ unique: false, })
    @ManyToOne()
    @JoinColumn()
    private Flight returnFlight;
    /** 去程日期(逗号分隔字符数组) */
    @Column(length = 2000)
    private String boundDates;
    @Column()
    /** 行程天数 */
    private Integer tripDays;
    /** 回程日期(逗号分隔字符数组) */
    @Column(length = 5000)
    private String returnDates;
    @Column()
    /** 机位数 */
    private Integer seatCount;
    @Column()
    /** 剩余机位数 */
    private Integer restSeat;
    /** 成人税费 */
    @Column()
    private BigDecimal priceTax_a;
    /** 儿童税费 */
    @Column()
    private BigDecimal priceTax_c;
    /** 供应商价格_成人 */
    @Column()
    private BigDecimal priceSupply_a;
    @Column()
    /** 供应商价格_儿童 */
    private BigDecimal priceSupply_c;
    /** 平台价格_成人 */
    @Column()
    private BigDecimal priceSelf_a;
    /** 平台价格_儿童 */
    @Column()
    private BigDecimal priceSelf_c;
    /** 代理商价格_成人 */
    @Column()
    private BigDecimal price2B_a;
    /** 代理商价格_儿童 */
    @Column()
    private BigDecimal price2B_c;
    /** C端价格_成人 */
    @Column()
    private BigDecimal price2C_a;
    /** C端价格_儿童 */

    @Column(nullable = true)
    private BigDecimal price2C_c;
    /** 销售规则 */
    @Column()
    private String saleRuler;
    @Column()
    /** 成团率(百分数) */
    private Double teamRate;
    @Column()
    /** 成行率(百分数) */
    private Double tripRate;
    /** 价格目标群体 */
    private ProductTargetEnum target;
    /** 代理商(逗号分隔字符数组) */
    @Column()
    private String buyers;
    /** 审核状态 */
    @Column()
    private AuditStatusEnum auditStatus;
    /** 变动日志 */
    @Column(nullable = true)
    private String changeLog;
    /** 供应商 */
    @Column()
    private Integer supplierId;
    /** 返程航班天数 */
    @Column(nullable = true)
    private Integer returnFlightPlusDays;

    /**
     * @return the auditStatus
     */
    public AuditStatusEnum getAuditStatus() {
        return auditStatus;
    }

    /**
     * @param auditStatus the auditStatus to set
     */
    public void setAuditStatus(AuditStatusEnum auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * @return the boundDates
     */
    public String getBoundDates() {
        return boundDates;
    }

    /**
     * @param boundDates the boundDates to set
     */
    public void setBoundDates(String boundDates) {
        this.boundDates = boundDates;
    }

    /**
     * @return the boundFlight
     */
    public Flight getBoundFlight() {
        return boundFlight;
    }

    /**
     * @param boundFlight the boundFlight to set
     */
    public void setBoundFlight(Flight boundFlight) {
        this.boundFlight = boundFlight;
    }

    /**
     * @return the buyers
     */
    public String getBuyers() {
        return buyers;
    }

    /**
     * @param buyers the buyers to set
     */
    public void setBuyers(String buyers) {
        this.buyers = buyers;
    }

    /**
     * @return the changeLog
     */
    public String getChangeLog() {
        return changeLog;
    }

    /**
     * @param changeLog the changeLog to set
     */
    public void setChangeLog(String changeLog) {
        this.changeLog = changeLog;
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
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the isDomesticLine
     */
    public Boolean getIsDomesticLine() {
        return isDomesticLine;
    }

    /**
     * @param isDomesticLine the isDomesticLine to set
     */
    public void setIsDomesticLine(Boolean isDomesticLine) {
        this.isDomesticLine = isDomesticLine;
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
     * @param price2b_c the price2B_c to set
     */
    public void setPrice2B_c(BigDecimal price2b_c) {
        price2B_c = price2b_c;
    }

    /**
     * @return the price2B_c
     */
    public BigDecimal getPrice2B_c() {
        return price2B_c;
    }

    /**
     * @param price2c_a the price2C_a to set
     */
    public void setPrice2C_a(BigDecimal price2c_a) {
        price2C_a = price2c_a;
    }

    /**
     * @return the price2C_a
     */
    public BigDecimal getPrice2C_a() {
        return price2C_a;
    }

    /**
     * @param price2c_c the price2C_c to set
     */
    public void setPrice2C_c(BigDecimal price2c_c) {
        price2C_c = price2c_c;
    }

    /**
     * @return the price2C_c
     */
    public BigDecimal getPrice2C_c() {
        return price2C_c;
    }

    /**
     * @param priceSelf_a the priceSelf_a to set
     */
    public void setPriceSelf_a(BigDecimal priceSelf_a) {
        this.priceSelf_a = priceSelf_a;
    }

    /**
     * @return the priceSelf_a
     */
    public BigDecimal getPriceSelf_a() {
        return priceSelf_a;
    }

    /**
     * @param priceSelf_c the priceSelf_c to set
     */
    public void setPriceSelf_c(BigDecimal priceSelf_c) {
        this.priceSelf_c = priceSelf_c;
    }

    /**
     * @return the priceSelf_c
     */
    public BigDecimal getPriceSelf_c() {
        return priceSelf_c;
    }

    /**
     * @param priceSupply_a the priceSupply_a to set
     */
    public void setPriceSupply_a(BigDecimal priceSupply_a) {
        this.priceSupply_a = priceSupply_a;
    }

    /**
     * @return the priceSupply_a
     */
    public BigDecimal getPriceSupply_a() {
        return priceSupply_a;
    }

    /**
     * @return the priceSupply_c
     */
    public BigDecimal getPriceSupply_c() {
        return priceSupply_c;
    }

    /**
     * @param priceSupply_c the priceSupply_c to set
     */
    public void setPriceSupply_c(BigDecimal priceSupply_c) {
        this.priceSupply_c = priceSupply_c;
    }

    /**
     * @return the priceTax_a
     */
    public BigDecimal getPriceTax_a() {
        return priceTax_a;
    }

    /**
     * @param priceTax_a the priceTax_a to set
     */
    public void setPriceTax_a(BigDecimal priceTax_a) {
        this.priceTax_a = priceTax_a;
    }

    /**
     * @return the priceTax_c
     */
    public BigDecimal getPriceTax_c() {
        return priceTax_c;
    }

    /**
     * @param priceTax_c the priceTax_c to set
     */
    public void setPriceTax_c(BigDecimal priceTax_c) {
        this.priceTax_c = priceTax_c;
    }

    /**
     * @return the productType
     */
    public ProductTypeEnum getProductType() {
        return productType;
    }

    /**
     * @param productType the productType to set
     */
    public void setProductType(ProductTypeEnum productType) {
        this.productType = productType;
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
     * @return the restSeat
     */
    public Integer getRestSeat() {
        return restSeat;
    }

    /**
     * @param restSeat the restSeat to set
     */
    public void setRestSeat(Integer restSeat) {
        this.restSeat = restSeat;
    }

    /**
     * @return the returnDates
     */
    public String getReturnDates() {
        return returnDates;
    }

    /**
     * @param returnDates the returnDates to set
     */
    public void setReturnDates(String returnDates) {
        this.returnDates = returnDates;
    }

    /**
     * @return the returnFlight
     */
    public Flight getReturnFlight() {
        return returnFlight;
    }

    /**
     * @param returnFlight the returnFlight to set
     */
    public void setReturnFlight(Flight returnFlight) {
        this.returnFlight = returnFlight;
    }

    /**
     * @return the returnFlightPlusDays
     */
    public Integer getReturnFlightPlusDays() {
        return returnFlightPlusDays;
    }

    /**
     * @param returnFlightPlusDays the returnFlightPlusDays to set
     */
    public void setReturnFlightPlusDays(Integer returnFlightPlusDays) {
        this.returnFlightPlusDays = returnFlightPlusDays;
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
     * @return the seatCount
     */
    public Integer getSeatCount() {
        return seatCount;
    }

    /**
     * @param seatCount the seatCount to set
     */
    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    /**
     * @return the sellType
     */
    public SellTypeEnum getSellType() {
        return sellType;
    }

    /**
     * @param sellType the sellType to set
     */
    public void setSellType(SellTypeEnum sellType) {
        this.sellType = sellType;
    }

    /**
     * @return the supplierId
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * @param supplierId the supplierId to set
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * @return the target
     */
    public ProductTargetEnum getTarget() {
        return target;
    }

    /**
     * @param target the target to set
     */
    public void setTarget(ProductTargetEnum target) {
        this.target = target;
    }

    /**
     * @return the teamRate
     */
    public Double getTeamRate() {
        return teamRate;
    }

    /**
     * @param teamRate the teamRate to set
     */
    public void setTeamRate(Double teamRate) {
        this.teamRate = teamRate;
    }

    /**
     * @return the tripDays
     */
    public Integer getTripDays() {
        return tripDays;
    }

    /**
     * @param tripDays the tripDays to set
     */
    public void setTripDays(Integer tripDays) {
        this.tripDays = tripDays;
    }

    /**
     * @return the tripRate
     */
    public Double getTripRate() {
        return tripRate;
    }

    /**
     * @param tripRate the tripRate to set
     */
    public void setTripRate(Double tripRate) {
        this.tripRate = tripRate;
    }

}
