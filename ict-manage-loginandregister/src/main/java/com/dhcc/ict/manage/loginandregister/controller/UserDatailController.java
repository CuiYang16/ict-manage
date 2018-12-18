package com.dhcc.ict.manage.loginandregister.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dhcc.ict.manage.loginandregister.pojo.UserDetail;
import com.dhcc.ict.manage.loginandregister.service.UserDetailService;

@Controller
public class UserDatailController {
	@Autowired
	private UserDetailService userdatailService;

	@RequestMapping("/")
	public String index() {
		return "index";

	}
	
	
	@RequestMapping("home")
	public ModelAndView login(HttpServletRequest request, String userName, String userPwd) {
		ModelAndView mv = null;
		HttpSession session = request.getSession();
		UserDetail localUser = userdatailService.search(userName, userPwd);
		if (localUser != null) {
			session.setAttribute("localUser", localUser);
			mv = new ModelAndView("redirect:home");
		} else {
			mv = new ModelAndView("redirect:index");
		}
		return mv;
	}
	
	
	@RequestMapping(value = "register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

	@RequestMapping(value = "adduser")
	public ModelAndView adduser(String userName, String account_number, String userPwd,String telephone) {
		ModelAndView mv = null;
		boolean flag = userdatailService.adduser(userName,account_number, userPwd,telephone);		
		mv = new ModelAndView("index");
		return mv;
	}
}
