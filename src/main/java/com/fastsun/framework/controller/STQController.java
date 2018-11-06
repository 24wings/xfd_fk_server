package com.fastsun.framework.controller;

import java.util.List;

import com.fastsun.framework.bean.*;
import com.fastsun.framework.bean.http.*;
import com.fastsun.framework.entity.rbac.Customer;
import com.fastsun.framework.service.STQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import net.sf.json.JSONObject;

@RestController
public class STQController {
    @Autowired
    private STQService stq;

    @PostMapping("/app/stq/query")
    public Res queryEntity(@RequestParam String className, @RequestBody QueryParam queryParam)
            throws ClassNotFoundException {
        Paging paging = stq.findPageEntity(queryParam, className);
        return Res.success().put("paging", paging);
    }

    // @PostMapping("/app/stq/entity/update")
    @PostMapping("/app/stq/entity/update")
    public Res dataUpdate(@RequestParam String className, @RequestBody JSONObject body) throws ClassNotFoundException {
        Object data = JSONObject.toBean(body, Class.forName(className));
        Object result = stq.update(data);
        return Res.success().put("result", result);
    }

    // @validate
    @PostMapping("/app/stq/entity/insert")
    public Res dataInsert(@RequestParam String className, @RequestBody JSONObject dataItem)
            throws ClassNotFoundException {
        try {
            Object entity = JSONObject.toBean(dataItem, Class.forName(className));
            boolean insert = stq.save(entity);
            return Res.success().put("ok", true).put("insert", insert);
        } catch (Exception e) {
            return Res.error(400, "唯一错误");
        }

    }

    @PostMapping("/app/stq/entity/delete")
    public Res entityDelete(String className, @RequestBody JSONObject dataItem) throws ClassNotFoundException {
        Object entity = JSONObject.toBean(dataItem, Class.forName(className));
        stq.delete(entity);
        return Res.success().put("ok", true);
    }

}