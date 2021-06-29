package com.jsr303;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class Jsr303Application {

    public static void main(String[] args) {
        SpringApplication.run(Jsr303Application.class, args);
        System.out.println("http://localhost:8082/swagger-ui.html");
    }

}
