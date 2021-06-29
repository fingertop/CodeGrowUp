package com.springfox3toswagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;



@EnableOpenApi
@SpringBootApplication
public class SpringFox3ToSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFox3ToSwaggerApplication.class, args);
        System.out.println("http://localhost:8085/swagger-ui/index.html");
    }

}
