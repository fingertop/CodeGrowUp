package com.tiga.traceone.controller;



import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class TraceController {


    @Autowired
    RestTemplate restTemplate;



    @RequestMapping(value = "/trace-one", method = RequestMethod.GET)
    public String trace() {
    	log.info("===call trace-1===");
    	return restTemplate.getForEntity("http://trace-two/trace-two", String.class).getBody();
    }



}