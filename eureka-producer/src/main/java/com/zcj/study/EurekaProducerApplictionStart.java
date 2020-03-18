package com.zcj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaProducerApplictionStart {
	public static void main(String[] args) {
		SpringApplication.run(EurekaProducerApplictionStart.class, args);
		System.out.println("================EurekaProducerApplictionStart has started!!!==============");
	}
}
