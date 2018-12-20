package com.dhcc.ict.manage.questionbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.dhcc.ict.manage.questionbank.pojo.TechnologyType;
import com.dhcc.ict.manage.questionbank.service.QuestionbankJudgeService;
import com.dhcc.ict.manage.questionbank.service.QuestionbankMuchService;
import com.dhcc.ict.manage.questionbank.service.QuestionbankService;

@Controller
@RequestMapping("/addexcel")
public class QuestionbankController {
	
	@Autowired
	private QuestionbankService questionbankService;
	@Autowired
	private QuestionbankMuchService questionbankMuchService;
	@Autowired
	private QuestionbankJudgeService questionbankJudgeService;
	
	//跳转上传excel页面
	@RequestMapping("excelym")
	public String index() {
		return "leadingexcel";
	}
	@RequestMapping("excelmuchym")
	public String excelmuchym() {
		return "importMuchExcel";
	}
	
	//导入单选题
	@RequestMapping(value="/importOneExcel",method=RequestMethod.POST)
	public String importExcel(MultipartFile upfile) throws Exception {
        if(upfile.isEmpty()){  
            System.out.println("文件不能为空");
         }
		
		try {
			Integer num=questionbankService.importExcel(upfile);
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println(e.getMessage());
			
			return "leadingexcel";
		}
		return "leadingexcelsssss";
	}
	
	//导入多选题
	@RequestMapping(value="/importMuchExcel",method=RequestMethod.POST)
	public String importMuchExcel(MultipartFile upfile) throws Exception{
		if (upfile.isEmpty()) {
			System.out.println("文件不能为空");
			
		}
		questionbankMuchService.importMuchExcel(upfile);
		return "leadingexcelsssss";
	}
	
	//导入判断题
		@RequestMapping(value="/importJudgeExcel",method=RequestMethod.POST)
		public String importJudgeExcel(MultipartFile upfile) throws Exception{
			if (upfile.isEmpty()) {
				System.out.println("文件不能为空");
				
			}
			questionbankJudgeService.importJudgeExcel(upfile);
			return "leadingexcelsssss";
		}
		
	
	
	

}
