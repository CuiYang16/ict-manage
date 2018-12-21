package com.dhcc.ict.manage.loginandregister.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.dhcc.ict.manage.loginandregister.pojo.CreateMD5;
import com.dhcc.ict.manage.loginandregister.pojo.ExamRecord;
import com.dhcc.ict.manage.loginandregister.pojo.UserDetail;
import com.dhcc.ict.manage.loginandregister.service.UserDetailService;

@Controller
public class UserDatailController {
	@Autowired
	private UserDetailService userDetailService;
	@Autowired
	private RestTemplate restTemplate;

	private static final int COOKIE_AGE = 60 * 60 * 24 * 7; // COOKIE保存时间

	@RequestMapping("/")
	public ModelAndView index(HttpServletRequest request) {
		ModelAndView mav = null;
		Cookie[] cookies = request.getCookies();
		String username = null;
		String userPwd = null;
		if (cookies != null) {
			/*
			 * 遍历cookie 判断cookie内是否有用户信息 如果有 用户名 密码就等于cookie内的数据是
			 */
			for (Cookie cookie : cookies) {
				if (username != null && userPwd != null) {
					break;
				}
				if ("username".equals(cookie.getName())) {
					username = cookie.getValue();
				}
				if ("userPwd".equals(cookie.getName())) {
					userPwd = cookie.getValue();
				}
			}
		}
		UserDetail localUser = userDetailService.search(username, userPwd);
		if (localUser != null) {

			mav = new ModelAndView("home");// 如果有数据直接进入首页
		} else {
			mav = new ModelAndView("index");// 如果没有进入登录页
		}
		return mav;
	}

	/*
	 * 登录接口
	 * 
	 */

	@RequestMapping("login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, String userName, String userPwd,
			String remember) {
		ModelAndView mv = null;
		String md5 = CreateMD5.getMd5(userPwd);// 加密
		HttpSession session = request.getSession();
		UserDetail localUser = userDetailService.search(userName, md5);
		if (localUser != null) {
			session.setAttribute("localUser", localUser);// 将信息存入session中
			Cookie[] cookies = request.getCookies();
			boolean cookieIsExists = false; // cookie存在标识
			if (cookies != null) {
				for (Cookie cookie : cookies) {
					if ("username".equals(cookie.getName())) {
						cookieIsExists = true;
						break;
					}
				}
			}
			//判断我记住是否勾选，如果勾选了 就将用户的信息存入cookie
			if (!cookieIsExists && "true".equals(remember)) {
				Cookie cookieUserName = new Cookie("username", userName);
				cookieUserName.setMaxAge(COOKIE_AGE);
				Cookie cookieUserPwd = new Cookie("userPwd", md5);
				cookieUserPwd.setMaxAge(COOKIE_AGE);
				response.addCookie(cookieUserName);
				response.addCookie(cookieUserPwd);
			}
			mv = new ModelAndView("home");
		} else {
			mv = new ModelAndView("index");
		}
		return mv;
	}

	/**
	 * 注册接口
	 * 
	 * @return
	 */
	@RequestMapping("/register")
	public String register(UserDetail userDetail) {

		userDetail.setUserPwd(CreateMD5.getMd5(userDetail.getUserPwd()));
		userDetailService.addUser(userDetail);
		return "index";
	}

	/**
	 * 验证用户名
	 * 
	 * @return
	 */
	@RequestMapping("/checkuser")
	@ResponseBody
	public String checkUserName(String userName) {
		boolean result = userDetailService.findUserName(userName);
		if (result) { // 已存在
			return "1";
		} else { // 不存在
			return "0";
		}
	}

	@RequestMapping("/test")
	public String returnTest() {
		return "redirect:ictmanagetechnologytest/tectest/tttt";

	}
	
	@RequestMapping("/score")
	public String analysisScore(ExamRecord examRecord) {
	
		return null;
		
		
	}

}
