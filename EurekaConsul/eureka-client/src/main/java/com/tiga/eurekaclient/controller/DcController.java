package com.tiga.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() throws InterruptedException {
        //人为触发服务降级Hystrix
        Thread.sleep(5000L);
        String services = "Services2: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

}