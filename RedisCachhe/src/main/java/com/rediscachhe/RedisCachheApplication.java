package com.rediscachhe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class RedisCachheApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisCachheApplication.class, args);
    }

}
