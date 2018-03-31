package com.zeal.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;

/**
*@description 管理员项目入口
*@author zeal
*@date 2018/3/31 19:03
*@version 1.0.0
*/
@EnableAsync
@EnableDiscoveryClient
@SpringBootApplication
public class AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}
}