package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.example.modules.product.dao")
@SpringBootApplication
public class CloudGulimallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudGulimallProductApplication.class, args);
    }

}
