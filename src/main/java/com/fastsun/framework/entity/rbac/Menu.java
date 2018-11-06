package com.fastsun.framework.entity.rbac;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Menu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer menuId;
    private String text;
    private String i18n;
    private Integer parentId;
    @Column
    private String link;
    private String externalink;
    private String target;
    private String icon;
    private Integer creatorId;
    private Integer config;
    private Integer menuCode;

    /**
     * @return the config
     */
    public Integer getConfig() {
        return config;
    }

    /**
     * @return the creatorId
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * @return the externalink
     */
    public String getExternalink() {
        return externalink;
    }

    /**
     * @return the i18n
     */
    public String getI18n() {
        return i18n;
    }

    /**
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * @return the menuCode
     */
    public Integer getMenuCode() {
        return menuCode;
    }

    /**
     * @return the menuId
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * @return the parentId
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @return the target
     */
    public String getTarget() {
        return target;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param config the config to set
     */
    public void setConfig(Integer config) {
        this.config = config;
    }

    /**
     * @param creatorId the creatorId to set
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * @param externalink the externalink to set
     */
    public void setExternalink(String externalink) {
        this.externalink = externalink;
    }

    /**
     * @param i18n the i18n to set
     */
    public void setI18n(String i18n) {
        this.i18n = i18n;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @param link the link to set
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @param menuCode the menuCode to set
     */
    public void setMenuCode(Integer menuCode) {
        this.menuCode = menuCode;
    }

    /**
     * @param menuId the menuId to set
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * @param parentId the parentId to set
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * @param target the target to set
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }
}
