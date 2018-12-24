package com.dhcc.ict.manage.examanalysis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.dhcc.ict.manage.examanalysis.dao")
@ComponentScan("com.dhcc.ict.manage.examanalysis.*")
@EnableEurekaClient
@EnableZuulProxy
public class ExamRecordAppliction {
	public static void main(String[] args) {
		SpringApplication.run(ExamRecordAppliction.class, args);
	}
}
