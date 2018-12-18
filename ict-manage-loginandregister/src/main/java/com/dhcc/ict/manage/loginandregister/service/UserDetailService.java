package com.dhcc.ict.manage.loginandregister.service;

import com.dhcc.ict.manage.loginandregister.pojo.UserDetail;

public interface UserDetailService {

	UserDetail search(String userName, String userPwd);

	boolean adduser(String userName, String account_number, String userPwd, String telephone);

}
