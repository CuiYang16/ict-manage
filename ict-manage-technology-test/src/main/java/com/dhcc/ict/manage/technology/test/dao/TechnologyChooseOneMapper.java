package com.dhcc.ict.manage.technology.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dhcc.ict.manage.technology.test.pojo.TechnologyChooseOne;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyChooseOneExample;

public interface TechnologyChooseOneMapper {
	int countByExample(TechnologyChooseOneExample example);

	int deleteByExample(TechnologyChooseOneExample example);

	int deleteByPrimaryKey(Integer chooseOneId);

	int insert(TechnologyChooseOne record);

	int insertSelective(TechnologyChooseOne record);

	List<TechnologyChooseOne> selectByExample(TechnologyChooseOneExample example);

	TechnologyChooseOne selectByPrimaryKey(Integer chooseOneId);

	int updateByExampleSelective(@Param("record") TechnologyChooseOne record,
			@Param("example") TechnologyChooseOneExample example);

	int updateByExample(@Param("record") TechnologyChooseOne record,
			@Param("example") TechnologyChooseOneExample example);

	int updateByPrimaryKeySelective(TechnologyChooseOne record);

	int updateByPrimaryKey(TechnologyChooseOne record);

	// 管理员添加
	List<TechnologyChooseOne> selectByLimit(@Param("startValue") int startValue, @Param("countValue") int countValue,
			@Param("testType") int testType);
}