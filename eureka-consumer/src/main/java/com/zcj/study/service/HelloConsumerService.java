package com.zcj.study.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "eureka-producer")
public interface HelloConsumerService {
	
	@RequestMapping(value = "/helloProducer")
    public String hello(@RequestParam(value = "name") String name);
}
