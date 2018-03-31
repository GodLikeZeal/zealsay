package com.zeal.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
*@description 云配置入口
*@author zeal
*@date 2018/3/31 18:50
*@version 1.0.0
*/
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}
}
