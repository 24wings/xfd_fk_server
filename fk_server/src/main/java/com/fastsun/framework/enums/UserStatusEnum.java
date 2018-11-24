package com.fastsun.framework.enums;

public enum UserStatusEnum {
    Active("Active"), Eanble("Enable");
    private String status;

    UserStatusEnum(String status) {
        this.status = status;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.status;
    }
}