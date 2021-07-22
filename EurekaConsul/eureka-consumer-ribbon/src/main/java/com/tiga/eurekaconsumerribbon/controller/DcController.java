package com.tiga.eurekaconsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController {


    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {
        //负载均衡的选出一个eureka-client的服务实例 建议启动不一样的eureka-client便于区分
        //使用@LoadBalanced替换LoadBalancerClient
        //没有使用一个具体的IP地址和端口的形式，而是采用了服务名的方式组成。
        //  因为Spring Cloud Ribbon有一个拦截器，
        // 它能够在这里进行实际调用的时候，自动的去选取服务实例，并将实际要请求的IP地址和端口替换这里的服务名，从而完成服务接口的调用。
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }
}