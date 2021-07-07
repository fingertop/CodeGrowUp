package com.ehcacheuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class EhCacheUseApplication {

    public static void main(String[] args) {
        SpringApplication.run(EhCacheUseApplication.class, args);
    }

}
