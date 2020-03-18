
package com.zcj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>Title: StudyApplicationStart.java</p>
 * <p>Description: Eureka服务启动类</p>
 * <p>Copyright: Copyright (c) 2017 ****信息技术有限公司</p>
 * <p>Company: ****信息技术有限公司</p>
 * <p>Author:我不痛，棍子痛</p>
 * <p>CreateTime:2019年3月14日下午2:08:06
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplicationStart {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplicationStart.class, args);
		System.out.println("================EurekaServerApplicationStart has started!!!==============");
	}
}
