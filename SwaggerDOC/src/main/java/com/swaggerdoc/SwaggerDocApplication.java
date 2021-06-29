package com.swaggerdoc;

import com.spring4all.swagger.EnableSwagger2Doc;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2Doc
@SpringBootApplication
public class SwaggerDocApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerDocApplication.class, args);
        System.out.println("http://localhost:8084/swagger-ui.html");
    }


}
