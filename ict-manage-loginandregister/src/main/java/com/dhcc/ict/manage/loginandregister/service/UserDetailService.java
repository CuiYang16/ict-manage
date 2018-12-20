package com.dhcc.ict.manage.loginandregister.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.ict.manage.loginandregister.dao.UserDetailMapper;
import com.dhcc.ict.manage.loginandregister.pojo.UserDetail;

@Service
public class UserDetailService {
	@Autowired
	UserDetailMapper userDetailMapper;

	public UserDetail search(String userName, String userPwd) {
		UserDetail user = userDetailMapper.search(userName, userPwd);
		return user;

	}

	public boolean findUserName(String userName) {
		return userDetailMapper.findUserName(userName) >0;
	}

	public int addUser(UserDetail UserDetail) {
		return userDetailMapper.addUser(UserDetail);
	}

}
