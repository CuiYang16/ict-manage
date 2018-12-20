package com.dhcc.ict.manage.loginandregister.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {
	@Bean
	// 使用添加@LoadBalanced注解后的RestTemplate调用服务提供者的接口时，
	// 可以使用虚拟IP替代真实IP地址。所谓的虚拟IP就是服务提供者在application.properties或yml文件中配置的spring.application.name属性的值
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
}
