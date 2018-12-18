package com.dhcc.ict.manage.technology.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dhcc.ict.manage.technology.test.pojo.TechnologyJudge;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyJudgeExample;

public interface TechnologyJudgeMapper {
	int countByExample(TechnologyJudgeExample example);

	int deleteByExample(TechnologyJudgeExample example);

	int deleteByPrimaryKey(Integer technologyJudgeId);

	int insert(TechnologyJudge record);

	int insertSelective(TechnologyJudge record);

	List<TechnologyJudge> selectByExample(TechnologyJudgeExample example);

	TechnologyJudge selectByPrimaryKey(Integer technologyJudgeId);

	int updateByExampleSelective(@Param("record") TechnologyJudge record,
			@Param("example") TechnologyJudgeExample example);

	int updateByExample(@Param("record") TechnologyJudge record, @Param("example") TechnologyJudgeExample example);

	int updateByPrimaryKeySelective(TechnologyJudge record);

	int updateByPrimaryKey(TechnologyJudge record);

	// 管理员添加
	List<TechnologyJudge> selectByLimitJudge(@Param("startValue") int startValue, @Param("countValue") int countValue,
			@Param("testType") int testType);
}