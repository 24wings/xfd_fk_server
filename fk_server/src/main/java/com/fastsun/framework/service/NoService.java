package com.fastsun.framework.service;

import com.fastsun.Q;
import com.fastsun.framework.entity.rbac.No;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoService {
    @Autowired
    private STQService stqService;

    public Integer getNo(String key) {
        No no = this.stqService.findOne(Q.one().$eq("currentKey", key).getQueryParam(), No.class);
        if (no != null) {
            Integer result = no.getCurrentValue();
            result++;
            no.setCurrentValue(result);
            this.stqService.update(no);
            return result;
        } else {
            No newNo = new No();
            newNo.setCurrentKey(key);
            newNo.setCurrentValue(0);
            this.stqService.save(newNo);
            return 0;
        }
    }
}