package com.dhcc.ict.manage.technology.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.dhcc.ict.manage.technology.test.dao")
@ComponentScan("com.dhcc.ict.manage.technology.test.*")
@EnableZuulProxy
public class TecTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(TecTestApplication.class, args);
	}
}
