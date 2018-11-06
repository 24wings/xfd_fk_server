package com.fastsun.framework.bean.http;

public class SummaryParameter {
    private String fieldName;
    private String sumName;
    private String sumTitle;
    private String sumType;
    private Object sumValue;

    public SummaryParameter() {
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getSumName() {
        return sumName;
    }

    public void setSumName(String sumName) {
        this.sumName = sumName;
    }

    public String getSumTitle() {
        return sumTitle;
    }

    public void setSumTitle(String sumTitle) {
        this.sumTitle = sumTitle;
    }

    public String getSumType() {
        return sumType;
    }

    public void setSumType(String sumType) {
        this.sumType = sumType;
    }

    public Object getSumValue() {
        return sumValue;
    }

    public void setSumValue(Object sumValue) {
        this.sumValue = sumValue;
    }
}
