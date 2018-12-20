package com.dhcc.ict.manage.technology.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping("/totest")
	public String toTest() {
		return "technology_test";
	}
}
