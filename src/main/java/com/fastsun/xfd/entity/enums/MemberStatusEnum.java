package com.fastsun.xfd.entity.enums;

public enum MemberStatusEnum {
    Enable("Enable"), Disabled("Disabled");
    private String status;

    MemberStatusEnum(String status) {
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
