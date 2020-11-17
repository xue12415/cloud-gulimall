package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.example.modules.ware.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class CloudGulimallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGulimallWareApplication.class, args);
    }

}
