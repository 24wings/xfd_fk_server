package com.fastsun.hk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity()
public class Airport {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /** 机场Id */
    private Integer id;
    @Column(nullable = false, unique = true)
    /** 代码 */
    private String code;
    @Column(nullable = true, unique = true)
    /** 名称 */
    private String name;
    @Column()
    /** 城市三字代码 */
    private String cityCode;

    private String startAirportCode;

    // @Column({ nullable: false })
    // pinyin: string;
    @Column(nullable = true)
    private String cityName;
    @Column(nullable = false)
    private Integer cityId;

    /**
     * @return the cityCode
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * @param cityCode the cityCode to set
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * @return the cityId
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * @param cityId the cityId to set
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * @return the cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * @param cityName the cityName to set
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
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
     * @return the startAirportCode
     */
    public String getStartAirportCode() {
        return startAirportCode;
    }

    /**
     * @param startAirportCode the startAirportCode to set
     */
    public void setStartAirportCode(String startAirportCode) {
        this.startAirportCode = startAirportCode;
    }
}