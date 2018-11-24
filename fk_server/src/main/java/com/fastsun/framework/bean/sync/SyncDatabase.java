package com.fastsun.framework.bean.sync;

import java.util.List;

public class SyncDatabase {
    private String database;
    private List<SyncTableData> tables;

    public String getDatabase() {
        return database;
    }

    /**
     * @return the tables
     */
    public List<SyncTableData> getTables() {
        return tables;
    }

    /**
     * @param database the database to set
     */
    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * @param tables the tables to set
     */
    public void setTables(List<SyncTableData> tables) {
        this.tables = tables;
    }

}