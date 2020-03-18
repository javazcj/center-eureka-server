package com.zcj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
//启用feign进行远程调用
@EnableFeignClients
public class EurekaConsumerApplictionStart {
	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerApplictionStart.class, args);
		System.out.println("================EurekaConsumerApplictionStart has started!!!==============");
	}
}
