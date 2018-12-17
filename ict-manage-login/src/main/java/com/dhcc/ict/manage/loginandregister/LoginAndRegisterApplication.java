package com.dhcc.ict.manage.loginandregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LoginAndRegisterApplication {
	public static void main(String[] args) {
		SpringApplication.run(LoginAndRegisterApplication.class, args);
	}
}
