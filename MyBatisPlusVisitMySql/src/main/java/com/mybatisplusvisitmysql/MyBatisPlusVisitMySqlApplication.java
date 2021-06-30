package com.mybatisplusvisitmysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mybatisplusvisitmysql.mapper")
public class MyBatisPlusVisitMySqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisPlusVisitMySqlApplication.class, args);
    }

}
