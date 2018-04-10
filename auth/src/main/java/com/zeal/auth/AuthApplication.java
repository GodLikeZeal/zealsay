package com.zeal.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
*@description 统一安全认证服务入口
 *                     获取用户信息也是通过这个应用实现
 *                      这里既是认证服务器，也是资源服务器
 *                      EnableResourceServer
*@author zeal
*@date 2018-04-05 16:43
*@version 1.0.0
*/
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.zeal.zealsay.common", "com.zeal.auth"})
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}
}
