package com.tiga.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Value("${info.profile}")
    String profile;
    
    @RequestMapping("/test")
    public String index(){
        return profile;
    }
}
