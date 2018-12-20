package com.dhcc.ict.manage.questionbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhcc.ict.manage.questionbank.pojo.TechnologyType;
import com.dhcc.ict.manage.questionbank.pojo.QuestionBankOne;
import com.dhcc.ict.manage.questionbank.service.ShowListService;

@Controller
@RequestMapping("/show")
public class ShowListController {
	@Autowired
	private ShowListService showListService;

	// 去单选题库页面
	@RequestMapping("/gooneym")
	public String strone() {
		return "showTechnology";

	}

	// 查询单选题库
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping("onetype") public List<TechnologyType> technologyOnelist(){
	 * return showListService.technologyOnelist();
	 * 
	 * }
	 */

	// 查询单选题库
	@ResponseBody
	@RequestMapping("/one")
	public List<QuestionBankOne> qusetionOnelist() {

		List<QuestionBankOne> list = showListService.questionOnelist();

		return list;
	}

}
