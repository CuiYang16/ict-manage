package com.dhcc.ict.manage.technology.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dhcc.ict.manage.technology.test.pojo.ExamUserAnswer;
import com.dhcc.ict.manage.technology.test.pojo.ExamUserAnswerExample;

public interface ExamUserAnswerMapper {
	int countByExample(ExamUserAnswerExample example);

	int deleteByExample(ExamUserAnswerExample example);

	int deleteByPrimaryKey(Integer userAnswerId);

	int insert(ExamUserAnswer record);

	int insertSelective(ExamUserAnswer record);

	List<ExamUserAnswer> selectByExample(ExamUserAnswerExample example);

	ExamUserAnswer selectByPrimaryKey(Integer userAnswerId);

	int updateByExampleSelective(@Param("record") ExamUserAnswer record,
			@Param("example") ExamUserAnswerExample example);

	int updateByExample(@Param("record") ExamUserAnswer record, @Param("example") ExamUserAnswerExample example);

	int updateByPrimaryKeySelective(ExamUserAnswer record);

	int updateByPrimaryKey(ExamUserAnswer record);

	// 管理员添加
	// 添加用户答案
	int insertUserAnswer(@Param("answers") List<ExamUserAnswer> answers);
}