package com.fastsun.framework.controller;

import java.util.List;

import com.fastsun.framework.bean.http.*;
import com.fastsun.framework.bean.sync.SyncDatabase;
import com.fastsun.framework.bean.sync.SyncTableData;
import com.fastsun.framework.service.STQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONObject;

@RestController
public class SyncDataController {
    @Autowired
    private STQService stq;

    // @PostMapping("/dev/sync")
    public Res queryEntity(@RequestBody SyncDatabase syncDatabase) throws ClassNotFoundException {
        List<SyncTableData> tables = syncDatabase.getTables();
        if (syncDatabase.getDatabase().equals("xfd_fk")) {
            for (int i = 0; i < tables.size(); i++) {
                SyncTableData tableData = tables.get(i);
                String objectCode = tableData.getObjectCode();
                Class entityClazz = Class.forName(objectCode);
                List<JSONObject> dataItems = tableData.getDataItems();
                for (int j = 0; j < dataItems.size(); j++) {
                    JSONObject dataItem = dataItems.get(j);
                    Object entity = JSONObject.toBean(dataItem, entityClazz);
                    stq.save(entity);
                }

            }
        }
        return Res.success().put("paging", syncDatabase);
    }

}