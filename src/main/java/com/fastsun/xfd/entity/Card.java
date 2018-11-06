package com.fastsun.xfd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fastsun.xfd.entity.enums.CardStatusEnum;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cardNo; // 卡号
    CardStatusEnum cardStatus; // 卡状态
    @Column
    private String merchNo; // 商户号

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
     * @return the cardStatus
     */
    public CardStatusEnum getCardStatus() {
        return cardStatus;
    }

    /**
     * @param cardStatus the cardStatus to set
     */
    public void setCardStatus(CardStatusEnum cardStatus) {
        this.cardStatus = cardStatus;
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
     * @return the merchNo
     */
    public String getMerchNo() {
        return merchNo;
    }

    /**
     * @param merchNo the merchNo to set
     */
    public void setMerchNo(String merchNo) {
        this.merchNo = merchNo;
    }
}