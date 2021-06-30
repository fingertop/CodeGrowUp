package com.springdatajpavisitmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaVisitMySqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaVisitMySqlApplication.class, args);
        System.out.println("http://localhost:8090/druid");
        System.out.println("http://localhost:8091/actuator");
    }

}
