package com.fastsun.hk.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fastsun.hk.enums.MsgTypeEnum;

@Entity()
public class MsgNotify {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /** 为空时全部发 */
    @Column(nullable = true)
    private Integer orgId;
    @Column(nullable = true)
    private Integer msgCode;

    /** 发给用户,为空时不限制 */
    @Column(nullable = true)
    private Integer userId;
    /** 消息类型,大类,通知,消息,代办 */
    @Column()
    private MsgTypeEnum msgType;// 消息类型
    @Column()
    private String title;// 消息摘要
    @Column()
    private String content;// 消息内容
    @Column()
    private String addition;// 附加内容
    @Column()
    private Date createTime = new Date();// 创建时间
    @Column(nullable = true)
    private Integer creatorId;// 创建人Id
    @Column(nullable = true)
    private String creator;// 创建人姓名
    @Column()
    private Boolean isRead = false;
    @Column()
    private Boolean isJPush = false;
    @Column()
    private Boolean isWebpush = true;
    /** 视图名称,也是消息类型 */
    @Column()
    private String viewName;

    /**
     * @return the addition
     */
    public String getAddition() {
        return addition;
    }

    /**
     * @param addition the addition to set
     */
    public void setAddition(String addition) {
        this.addition = addition;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
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
     * @return the creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator the creator to set
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return the creatorId
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * @param creatorId the creatorId to set
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
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
     * @param isJPush the isJPush to set
     */
    public void setIsJPush(Boolean isJPush) {
        this.isJPush = isJPush;
    }

    /**
     * @return the isJPush
     */
    public Boolean getIsJPush() {
        return isJPush;
    }

    /**
     * @param isRead the isRead to set
     */
    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    /**
     * @param isWebpush the isWebpush to set
     */
    public void setIsWebpush(Boolean isWebpush) {
        this.isWebpush = isWebpush;
    }

    /**
     * @return the isRead
     */
    public Boolean getIsRead() {
        return isRead;
    }

    /**
     * @return the isWebpush
     */
    public Boolean getIsWebpush() {
        return isWebpush;
    }

    /**
     * @return the msgCode
     */
    public Integer getMsgCode() {
        return msgCode;
    }

    /**
     * @param msgCode the msgCode to set
     */
    public void setMsgCode(Integer msgCode) {
        this.msgCode = msgCode;
    }

    /**
     * @return the msgType
     */
    public MsgTypeEnum getMsgType() {
        return msgType;
    }

    /**
     * @param msgType the msgType to set
     */
    public void setMsgType(MsgTypeEnum msgType) {
        this.msgType = msgType;
    }

    /**
     * @return the orgId
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * @param orgId the orgId to set
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return the viewName
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * @param viewName the viewName to set
     */
    public void setViewName(String viewName) {
        this.viewName = viewName;
    }
}