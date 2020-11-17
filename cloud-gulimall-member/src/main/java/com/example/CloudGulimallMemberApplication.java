package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.example.modules.member.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class CloudGulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGulimallMemberApplication.class, args);
    }

}
