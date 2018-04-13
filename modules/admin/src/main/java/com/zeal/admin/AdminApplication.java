package com.zeal.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
*@description 管理员项目入口
*@author zeal
*@date 2018/3/31 19:03
*@version 1.0.0
*/
@EnableAsync
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.zeal.zealsay.common","com.zeal.admin"})
public class AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}
}
