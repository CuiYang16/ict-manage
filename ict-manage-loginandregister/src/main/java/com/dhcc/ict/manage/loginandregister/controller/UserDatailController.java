package com.dhcc.ict.manage.loginandregister.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dhcc.ict.manage.loginandregister.pojo.UserDetail;
import com.dhcc.ict.manage.loginandregister.service.UserDetailService;



@Controller
public class UserDatailController {
	@Autowired
	private UserDetailService userDetailService;

	@RequestMapping("/")
	public String index() {
		return "index";

	}
	
	/*
	 * 登录接口
	 * 
	 * */
	
	@RequestMapping("login")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response, String userName, String userPwd) {
		ModelAndView mv = null;
		HttpSession session = request.getSession();
		UserDetail localUser = userDetailService.search(userName, userPwd);
	
		if (localUser != null) {
			session.setAttribute("localUser", localUser);
			Cookie cookie=new Cookie("username",userName );
			Cookie cookie2=new Cookie("userPwd", userPwd);
			response.addCookie(cookie);
			response.addCookie(cookie2);
			mv = new ModelAndView("home");
		} else {
			mv = new ModelAndView("index");
		}
		return mv;
	}	
	
	/**
	 * 注册接口
	 * @return
	 */
	@RequestMapping("/register")
	public String register(UserDetail userDetail,Model model){
		userDetailService.addUser(userDetail);
		return "index";
	}
	  
	/**
	 *  验证用户名
	 * @return
	 */
	@RequestMapping("/checkuser")
	@ResponseBody
	public String checkUserName(String userName){
		boolean result=userDetailService.findUserName(userName);
		if(result) { //已存在
			return "1";
		}
		else { //不存在
			return "0";
		}
	}
}
