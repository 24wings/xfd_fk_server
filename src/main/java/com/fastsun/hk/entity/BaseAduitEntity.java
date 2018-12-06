package com.fastsun.hk.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity()
public abstract class BaseAduitEntity {
    @Column(nullable = false, length = 50)
    private String createdBy;
    @Column(nullable = false)
    private Date createdDate = new Date();

    @Column(length = 50)
    private String modifiedBy;

    @Column()
    Date modifiedDate = new Date();
}