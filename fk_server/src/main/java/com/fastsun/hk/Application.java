package com.fastsun.hk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.fastsun")
@ComponentScan(basePackages = { "com.fastsun", "com.fastsun.xfd.service.*", "com.fastsun.framework.service.*",
        "com.fastsun.framework.jpa.*" })
@EntityScan(basePackages = { "com.fastsun.framework.entity.rbac", "com.fastsun.framework.entity.queryTemplate",
        "com.fastsun.xfd.entity" })
@SpringBootApplication
// @EnableDiscoveryClient
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}