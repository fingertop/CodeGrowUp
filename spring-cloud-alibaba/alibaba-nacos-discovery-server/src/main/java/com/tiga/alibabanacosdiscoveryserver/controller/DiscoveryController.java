package com.tiga.alibabanacosdiscoveryserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname DiscoveryController
 * @Description TODO
 * @Date 2021/8/17 21:55
 * @Created by tiga
 */
@Slf4j
@RestController
public class DiscoveryController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        log.info("invoked name = " + name);
        return "hello " + name;
    }
    
}
