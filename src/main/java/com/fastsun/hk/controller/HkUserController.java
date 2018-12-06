package com.fastsun.hk.controller;

import com.fastsun.framework.bean.LoginBean;
import com.fastsun.framework.bean.http.Res;
import com.fastsun.hk.entity.Product;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/person")
@Api(tags = "航空登陆接口", description = "航空登陆接口", hidden = true)
public class HkUserController extends WebMvcConfigurationSupport {
    @PostMapping("/")
    private Res login(@RequestBody LoginBean loginBean){

        return Res.success();
    }

    
}
