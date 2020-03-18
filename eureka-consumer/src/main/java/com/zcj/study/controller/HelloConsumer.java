package com.zcj.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zcj.study.service.HelloConsumerService;

@RestController
public class HelloConsumer {
	@Autowired
    private HelloConsumerService helloConsumerService;

    @RequestMapping("/getMessage")
    public String getMessage(String name){
        return helloConsumerService.hello(name);
    }
}
