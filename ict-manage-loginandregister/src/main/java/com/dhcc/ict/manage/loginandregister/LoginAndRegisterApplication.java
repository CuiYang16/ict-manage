package com.dhcc.ict.manage.loginandregister;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.dhcc.ict.manage.loginandregister.dao")
@ComponentScan("com.dhcc.ict.manage.loginandregister.*")
@EnableEurekaClient
public class LoginAndRegisterApplication {
	public static void main(String[] args) {
		SpringApplication.run(LoginAndRegisterApplication.class, args);
	}
}
