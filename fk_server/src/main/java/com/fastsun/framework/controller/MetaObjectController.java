package com.fastsun.framework.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fastsun.framework.bean.http.*;
import com.fastsun.framework.service.SqlEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import net.sf.json.JSONObject;

@RestController
public class MetaObjectController {
    @Autowired
    private SqlEntityService sqlEntityService;

    @RequestMapping(value = "/field", method = RequestMethod.POST)
    public Res getFields(HttpServletRequest request, HttpServletResponse response) {
        Res resp = null;
        BufferedReader streamReader = null;
        JSONObject json = null;
        try {
            streamReader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = streamReader.readLine()) != null) {
                sb.append(line);
            }
            json = JSONObject.fromObject(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        String sql = (String) json.get("sql");
        List<JSONObject> fields = this.sqlEntityService.getFieldInfoBySql(sql);
        resp = Res.success();
        resp.getData().put("fields", fields);
        return resp;
    }
}