package com.dhcc.ict.manage.technology.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dhcc.ict.manage.technology.test.service.TechnologyService;

@Controller
public class TechnologyController {

	@Autowired
	private TechnologyService technologyService;

}
