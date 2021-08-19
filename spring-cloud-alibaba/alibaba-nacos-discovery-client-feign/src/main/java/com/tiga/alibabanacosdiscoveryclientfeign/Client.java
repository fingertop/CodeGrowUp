package com.tiga.alibabanacosdiscoveryclientfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("alibaba-nacos-discovery-server")
// @Component
public interface Client {

        @GetMapping("/hello")
        String hello(@RequestParam(name = "name") String name);

}