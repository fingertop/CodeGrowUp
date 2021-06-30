package com.mybatisofxml;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.mybatisofxml.mapper")
@SpringBootApplication
public class MyBatisOfXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisOfXmlApplication.class, args);
    }

}
