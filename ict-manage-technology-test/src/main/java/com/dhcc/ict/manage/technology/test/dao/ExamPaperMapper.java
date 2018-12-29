package com.dhcc.ict.manage.technology.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dhcc.ict.manage.technology.test.pojo.ExamPaper;
import com.dhcc.ict.manage.technology.test.pojo.ExamPaperExample;

public interface ExamPaperMapper {
	int countByExample(ExamPaperExample example);

	int deleteByExample(ExamPaperExample example);

	int deleteByPrimaryKey(Integer examPaperId);

	int insert(ExamPaper record);

	int insertSelective(ExamPaper record);

	List<ExamPaper> selectByExample(ExamPaperExample example);

	ExamPaper selectByPrimaryKey(Integer examPaperId);

	int updateByExampleSelective(@Param("record") ExamPaper record, @Param("example") ExamPaperExample example);

	int updateByExample(@Param("record") ExamPaper record, @Param("example") ExamPaperExample example);

	int updateByPrimaryKeySelective(ExamPaper record);

	int updateByPrimaryKey(ExamPaper record);

	// 管理员添加
	// 保存试卷
	int insertPaper(@Param("papers") List<ExamPaper> papers);
}