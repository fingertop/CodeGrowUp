package com.tiga.alibabanacosdiscoveryclientfeign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public  class TestController {

    @Autowired
    Client client;

    @GetMapping("/test")
    public String test() {
        String result = client.hello("tiga-Feign");
        return "Return : " + result;
    }
}