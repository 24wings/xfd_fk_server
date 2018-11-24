package com.fastsun.framework.bean.sync;

import java.util.List;

import net.sf.json.JSONObject;

public class SyncTableData {
    private String database;
    private String objectCode;
    private List<JSONObject> dataItems;

    /**
     * @return the database
     */
    public String getDatabase() {
        return database;
    }

    /**
     * @param database the database to set
     */
    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * @return the dataItems
     */
    public List<JSONObject> getDataItems() {
        return dataItems;
    }

    /**
     * @return the objectCode
     */
    public String getObjectCode() {
        return objectCode;
    }

    /**
     * @param dataItems the dataItems to set
     */
    public void setDataItems(List<JSONObject> dataItems) {
        this.dataItems = dataItems;
    }

    /**
     * @param objectCode the objectCode to set
     */
    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

}
