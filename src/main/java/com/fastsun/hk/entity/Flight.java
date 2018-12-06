package com.fastsun.hk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 航司：自动从航班号带出 航班号: [出发信息] 出发机场:三字代码查询 出发时间:当地时间 [经停信息] 经停机场: 到达时间:当地时间 经停时长:分钟数
 * [到达信息] 到达机场: 到达时间:当地时间 +天数:-1 班次信息：出发日期规则
 * @author 廖为民
 * @version 1.0
 * @updated 2018-9-22 15:03:47
 */
/** 航班信息 */
@Entity()
public class Flight extends BaseAduitEntity {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column()
    /** 航班代码(航司2字代码+4字航班号 */
    private String code;
    @Column(nullable = true)
    /** 航班信息 */
    private String flightInfo;
    @Column()
    /** 航司二字代码 */
    private String airCompanyCode;
    @Column(nullable = true)
    /** 航司名称 */
    private String airCompanyName;
    @Column()
    /** 出发机场三字代码 */
    private String startAirportCode;
    @Column(nullable = true)
    private Integer startCityId;
    @Column()
    private String startCityCode;
    @Column()
    private String startCityName;

    @Column()
    /** 出发机场名称 */
    private String startAirportName;
    /** 出发航站楼 */
    @Column()
    private String startTerminal;
    @Column()
    /** 出发时间 */
    private String startTime;
    @Column(nullable = true)
    /** 经停机场三字代码 */
    private String stopAirportCode;
    @Column(nullable = true)
    /** 经停机场名称 */
    private String stopAirportName;
    @Column(nullable = true)
    private String stopCityCode;
    @Column(nullable = true)
    private Integer stopCityId;
    @Column(nullable = true)
    /** 经停到达时间 */
    private String stopTime;
    @Column(nullable = true)
    /** 经停时长(分钟数) */
    private Integer stopMinutes;
    @Column()
    /** 到达机场三字代码 */
    private String endAirportCode;
    @Column()
    /** 到达机场名称 */
    private String endAirportName;
    @Column()
    private String endCityName;
    /** 到达航站楼 */
    @Column()
    private String endTerminal;
    @Column()
    /** 到达时间 */
    private String endTime;
    @Column()
    /** 到达时间加减天数 */
    private Integer plusDays;
    @Column()
    private String endCityCode;
    @Column()
    private Integer endCityId;

    /**
     * @return the airCompanyCode
     */
    public String getAirCompanyCode() {
        return airCompanyCode;
    }

    /**
     * @param airCompanyCode the airCompanyCode to set
     */
    public void setAirCompanyCode(String airCompanyCode) {
        this.airCompanyCode = airCompanyCode;
    }

    /**
     * @return the airCompanyName
     */
    public String getAirCompanyName() {
        return airCompanyName;
    }

    /**
     * @param airCompanyName the airCompanyName to set
     */
    public void setAirCompanyName(String airCompanyName) {
        this.airCompanyName = airCompanyName;
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
     * @return the endAirportCode
     */
    public String getEndAirportCode() {
        return endAirportCode;
    }

    /**
     * @param endAirportCode the endAirportCode to set
     */
    public void setEndAirportCode(String endAirportCode) {
        this.endAirportCode = endAirportCode;
    }

    /**
     * @return the endAirportName
     */
    public String getEndAirportName() {
        return endAirportName;
    }

    /**
     * @param endAirportName the endAirportName to set
     */
    public void setEndAirportName(String endAirportName) {
        this.endAirportName = endAirportName;
    }

    /**
     * @return the endCityCode
     */
    public String getEndCityCode() {
        return endCityCode;
    }

    /**
     * @param endCityCode the endCityCode to set
     */
    public void setEndCityCode(String endCityCode) {
        this.endCityCode = endCityCode;
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
     * @return the endTerminal
     */
    public String getEndTerminal() {
        return endTerminal;
    }

    /**
     * @param endTerminal the endTerminal to set
     */
    public void setEndTerminal(String endTerminal) {
        this.endTerminal = endTerminal;
    }

    /**
     * @return the endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the flightInfo
     */
    public String getFlightInfo() {
        return flightInfo;
    }

    /**
     * @param flightInfo the flightInfo to set
     */
    public void setFlightInfo(String flightInfo) {
        this.flightInfo = flightInfo;
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
     * @return the plusDays
     */
    public Integer getPlusDays() {
        return plusDays;
    }

    /**
     * @return the startAirportCode
     */
    public String getStartAirportCode() {
        return startAirportCode;
    }

    /**
     * @param plusDays the plusDays to set
     */
    public void setPlusDays(Integer plusDays) {
        this.plusDays = plusDays;
    }

    /**
     * @return the startAirportName
     */
    public String getStartAirportName() {
        return startAirportName;
    }

    /**
     * @param startAirportCode the startAirportCode to set
     */
    public void setStartAirportCode(String startAirportCode) {
        this.startAirportCode = startAirportCode;
    }

    /**
     * @return the startCityCode
     */
    public String getStartCityCode() {
        return startCityCode;
    }

    /**
     * @param startAirportName the startAirportName to set
     */
    public void setStartAirportName(String startAirportName) {
        this.startAirportName = startAirportName;
    }

    /**
     * @return the startCityId
     */
    public Integer getStartCityId() {
        return startCityId;
    }

    /**
     * @param startCityCode the startCityCode to set
     */
    public void setStartCityCode(String startCityCode) {
        this.startCityCode = startCityCode;
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
     * @return the startTerminal
     */
    public String getStartTerminal() {
        return startTerminal;
    }

    /**
     * @param startTerminal the startTerminal to set
     */
    public void setStartTerminal(String startTerminal) {
        this.startTerminal = startTerminal;
    }

    /**
     * @return the startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the stopAirportCode
     */
    public String getStopAirportCode() {
        return stopAirportCode;
    }

    /**
     * @param stopAirportCode the stopAirportCode to set
     */
    public void setStopAirportCode(String stopAirportCode) {
        this.stopAirportCode = stopAirportCode;
    }

    /**
     * @return the stopAirportName
     */
    public String getStopAirportName() {
        return stopAirportName;
    }

    /**
     * @param stopAirportName the stopAirportName to set
     */
    public void setStopAirportName(String stopAirportName) {
        this.stopAirportName = stopAirportName;
    }

    /**
     * @return the stopCityCode
     */
    public String getStopCityCode() {
        return stopCityCode;
    }

    /**
     * @param stopCityCode the stopCityCode to set
     */
    public void setStopCityCode(String stopCityCode) {
        this.stopCityCode = stopCityCode;
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
     * @return the stopMinutes
     */
    public Integer getStopMinutes() {
        return stopMinutes;
    }

    /**
     * @param stopMinutes the stopMinutes to set
     */
    public void setStopMinutes(Integer stopMinutes) {
        this.stopMinutes = stopMinutes;
    }

    /**
     * @return the stopTime
     */
    public String getStopTime() {
        return stopTime;
    }

    /**
     * @param stopTime the stopTime to set
     */
    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

}