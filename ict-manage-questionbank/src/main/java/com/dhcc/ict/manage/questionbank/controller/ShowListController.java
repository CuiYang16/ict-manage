package com.dhcc.ict.manage.questionbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhcc.ict.manage.questionbank.pojo.TechnologyType;
import com.dhcc.ict.manage.questionbank.pojo.QuestionBankJudge;
import com.dhcc.ict.manage.questionbank.pojo.QuestionBankMuch;
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
	
	// 去多选题库页面
		@RequestMapping("/gomuchym")
		public String showchoosemuch() {
			return "showchoosemuch";

		}
		
		// 去判断题库页面
		@RequestMapping("/gojudgeym")
		public String showjudge() {
			return "showjudge";

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
	
	// 查询多选题库
		@ResponseBody
		@RequestMapping("/much")
		public List<QuestionBankMuch> qusetionMuchlist() {

			List<QuestionBankMuch> listmuch = showListService.qusetionMuchlist();

			return listmuch;
		}
		
		// 查询判断题库
		@ResponseBody
		@RequestMapping("/judge")
		public List<QuestionBankJudge> qusetionJudgelist() {

			List<QuestionBankJudge> listjudge = showListService.qusetionJudgelist();

			return listjudge;
		}
	/**
	 * 
	 * @param chooseOneId 删除单个选择题的id
	 * @return 返回页面的$.get的值
	 */
	@RequestMapping("onedelete")
	@ResponseBody
	public String qusetionOnedelete( Integer chooseOneId) {
		if (chooseOneId == null) {
			return "error";
		}else {
			 showListService.qusetionOnedelete(chooseOneId);
			 return "ok";
		}
	}
	
	
	/**
	 * 
	 * @param ids 批量删除和全选删除选择题的id
	 * @return  返回页面的data值
	 */
		@RequestMapping("onedeleteall")
		@ResponseBody
		public String qusetionOneDeleteAll( Integer[] ids) {
			System.out.println("hhhhhhhhhhhhh");
			if (ids == null) {
				return "error";
			}else {
				 showListService.qusetionOneDeleteAll(ids);
				 return "ok";
			}
		}
	

}
