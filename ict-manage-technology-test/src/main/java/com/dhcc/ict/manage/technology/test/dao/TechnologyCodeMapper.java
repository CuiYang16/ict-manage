package com.dhcc.ict.manage.technology.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dhcc.ict.manage.technology.test.pojo.TechnologyCode;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyCodeExample;

public interface TechnologyCodeMapper {
	int countByExample(TechnologyCodeExample example);

	int deleteByExample(TechnologyCodeExample example);

	int deleteByPrimaryKey(Integer technologyCodeId);

	int insert(TechnologyCode record);

	int insertSelective(TechnologyCode record);

	List<TechnologyCode> selectByExample(TechnologyCodeExample example);

	TechnologyCode selectByPrimaryKey(Integer technologyCodeId);

	int updateByExampleSelective(@Param("record") TechnologyCode record,
			@Param("example") TechnologyCodeExample example);

	int updateByExample(@Param("record") TechnologyCode record, @Param("example") TechnologyCodeExample example);

	int updateByPrimaryKeySelective(TechnologyCode record);

	int updateByPrimaryKey(TechnologyCode record);

	// 管理员添加
	List<TechnologyCode> selectByLimitCode(@Param("startValue") int startValue, @Param("countValue") int countValue,
			@Param("technologyTypeId") int technologyTypeId, @Param("examComplexity") String examComplexity);

	// 根据试卷抽题
	List<TechnologyCode> selectByPaper(@Param("paperFlag") String paperFlag,
			@Param("questionType") String questionType);
}