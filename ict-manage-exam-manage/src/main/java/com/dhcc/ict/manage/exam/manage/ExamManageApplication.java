package com.dhcc.ict.manage.exam.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.dhcc.ict.manage.exam.manage.dao")
@ComponentScan("com.dhcc.ict.manage.exam.manage.*")
public class ExamManageApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExamManageApplication.class, args);
	}
}
