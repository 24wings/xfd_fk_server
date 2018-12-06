package com.fastsun.hk.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /** 城市Id */
    private Integer id;
    /** 城市代码 */
    @Column()
    private String code;
    @Column(nullable = true)
    private String province;
    /** 城市名 */
    @Column()
    private String name;
    /** 国家代码 */
    @Column()
    private String countryCode;
    @Column()
    private String countryName;
    @Column(nullable = false)
    private String pinyin;
}