package com.fastsun.framework.bean.http;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Res implements Serializable {
    private Boolean ok;
    private Integer status;
    private Map<String, Object> data = new HashMap<String, Object>();
    private String errMsg;
    private String msg;

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static Res success(Map<String, Object> data) {
        return new Res(true, 200, data, null);
    }

    public static Res success() {
        return new Res(true, 200, null, null);
    }

    public Res put(String key, Object value) {
        if (value != null)
            this.data.put(key, value);
        return this;
    }

    public static Res error(Integer status, String errorMsg) {
        Res res = new Res(false, status, null, errorMsg);
        res.msg = errorMsg;
        return res;
    }

    Res(Boolean ok, Integer status, Map<String, Object> data, String errMsg) {
        this.ok = ok;
        this.status = status;
        if (data != null) {
            this.data = data;
        }
        this.errMsg = errMsg;
    }

    /**
     * @return the data
     */
    public Map<String, Object> getData() {
        return data;
    }

    /**
     * @return the errMsg
     */
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * @return the status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param data the data to set
     */
    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    /**
     * @param errMsg the errMsg to set
     */
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return the ok
     */
    public Boolean getOk() {
        return ok;
    }

    /**
     * @param ok the ok to set
     */
    public void setOk(Boolean ok) {
        this.ok = ok;
    }

}