package com.processcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ProcessCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProcessCacheApplication.class, args);
    }

}
