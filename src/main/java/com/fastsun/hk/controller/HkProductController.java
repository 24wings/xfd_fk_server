package com.fastsun.hk.controller;

import com.fastsun.framework.bean.http.Res;
import com.fastsun.hk.entity.Product;
import com.fastsun.hk.enums.AuditStatusEnum;
import com.fastsun.hk.service.jpa.ProductJpa;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HkProductController {
    private ProductJpa productJpa;

    @PostMapping("/api/product/publish")
    private Res productPublish(@RequestBody Product product) {
        if (product != null) {
            product = productJpa.findById(product.getId()).get();
            if (product != null) {
                product.setAuditStatus(AuditStatusEnum.submitted);
                productJpa.save(product);
                return Res.success().put("msg", "成功发布产品");
            } else {
                return Res.error(400, "找不到产品");
            }
        } else {
            return Res.error(400, "找不到产品");
        }
    }
}