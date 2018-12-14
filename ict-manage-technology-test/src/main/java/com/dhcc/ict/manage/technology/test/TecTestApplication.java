package com.dhcc.ict.manage.technology.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TecTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(TecTestApplication.class, args);
	}
}
