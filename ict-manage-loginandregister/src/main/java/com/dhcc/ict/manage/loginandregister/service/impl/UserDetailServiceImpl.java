package com.dhcc.ict.manage.loginandregister.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.ict.manage.loginandregister.dao.UserDetailMapper;
import com.dhcc.ict.manage.loginandregister.pojo.UserDetail;
import com.dhcc.ict.manage.loginandregister.service.UserDetailService;
@Service
public class UserDetailServiceImpl implements UserDetailService{
	@Autowired
	UserDetailMapper userDetailMapper;

	@Override
	public UserDetail search(String userName, String userPwd) {
		UserDetail user=userDetailMapper.search(userName, userPwd);
		return user;

		
	}

	@Override
	public boolean adduser(String userName, String account_number, String userPwd, String telephone) {
	int rs=userDetailMapper.adduser(userName, account_number, userPwd, telephone);
		return rs>0;
	}

}
