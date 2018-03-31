package com.zeal.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
*@description 注册中心入口
*@author zeal
*@date 2018/3/31 20:12
*@version 1.0.0
*/
@EnableEurekaServer
@SpringBootApplication
public class EurekaForZealsayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaForZealsayApplication.class, args);
	}
}
