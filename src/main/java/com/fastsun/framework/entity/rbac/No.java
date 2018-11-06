package com.fastsun.framework.entity.rbac;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class No {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column()
    private String currentKey;
    @Column()
    private Integer currentValue;

    /**
     * @return the currentKey
     */
    public String getCurrentKey() {
        return currentKey;
    }

    /**
     * @param currentKey the currentKey to set
     */
    public void setCurrentKey(String currentKey) {
        this.currentKey = currentKey;
    }

    /**
     * @return the currentValue
     */
    public Integer getCurrentValue() {
        return currentValue;
    }

    /**
     * @param currentValue the currentValue to set
     */
    public void setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
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