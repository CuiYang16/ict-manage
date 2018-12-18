package com.dhcc.ict.manage.loginandregister.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.dhcc.ict.manage.loginandregister.pojo.UserDetail;
import com.dhcc.ict.manage.loginandregister.pojo.UserDetailExample;
@Mapper
public interface UserDetailMapper {
    int countByExample(UserDetailExample example);

    int deleteByExample(UserDetailExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserDetail record);

    int insertSelective(UserDetail record);

    List<UserDetail> selectByExample(UserDetailExample example);

    UserDetail selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserDetail record, @Param("example") UserDetailExample example);

    int updateByExample(@Param("record") UserDetail record, @Param("example") UserDetailExample example);

    int updateByPrimaryKeySelective(UserDetail record);

    int updateByPrimaryKey(UserDetail record);
    /*管理员添加*/
	UserDetail search(@Param("userName")String userName,@Param("userPwd") String userPwd);

	int adduser(@Param("userName")String userName, @Param("account_number")String account_number, @Param("userPwd")String userPwd,@Param("telephone")String telephone);
}