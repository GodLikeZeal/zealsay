package com.zeal.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerInterceptor;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
*@description 网关控制
*@author zeal
*@date 2018-04-05 10:33
*@version 1.0.0
*/
@EnableZuulProxy
@EnableFeignClients
@SpringCloudApplication
@ComponentScan(basePackages = {"com.zeal.gateway", "com.zeal.zealsay.common"})
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	@Bean
	LoadBalancerInterceptor loadBalancerInterceptor(LoadBalancerClient loadBalance){
		return new LoadBalancerInterceptor(loadBalance);
	}
}
