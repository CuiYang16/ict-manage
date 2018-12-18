package com.dhcc.ict.manage.technology.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dhcc.ict.manage.technology.test.pojo.TechnologyChooseMuch;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyChooseMuchExample;

public interface TechnologyChooseMuchMapper {
	int countByExample(TechnologyChooseMuchExample example);

	int deleteByExample(TechnologyChooseMuchExample example);

	int deleteByPrimaryKey(Integer chooseMuchId);

	int insert(TechnologyChooseMuch record);

	int insertSelective(TechnologyChooseMuch record);

	List<TechnologyChooseMuch> selectByExample(TechnologyChooseMuchExample example);

	TechnologyChooseMuch selectByPrimaryKey(Integer chooseMuchId);

	int updateByExampleSelective(@Param("record") TechnologyChooseMuch record,
			@Param("example") TechnologyChooseMuchExample example);

	int updateByExample(@Param("record") TechnologyChooseMuch record,
			@Param("example") TechnologyChooseMuchExample example);

	int updateByPrimaryKeySelective(TechnologyChooseMuch record);

	int updateByPrimaryKey(TechnologyChooseMuch record);

	// 管理员添加
	List<TechnologyChooseMuch> selectByLimitMuch(@Param("startValue") int startValue,
			@Param("countValue") int countValue, @Param("testType") String testType);
}