package com.dhcc.ict.manage.technology.test.dao;

import com.dhcc.ict.manage.technology.test.pojo.ExamQuestion;
import com.dhcc.ict.manage.technology.test.pojo.ExamQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamQuestionMapper {
    int countByExample(ExamQuestionExample example);

    int deleteByExample(ExamQuestionExample example);

    int deleteByPrimaryKey(Integer examQuestionId);

    int insert(ExamQuestion record);

    int insertSelective(ExamQuestion record);

    List<ExamQuestion> selectByExample(ExamQuestionExample example);

    ExamQuestion selectByPrimaryKey(Integer examQuestionId);

    int updateByExampleSelective(@Param("record") ExamQuestion record, @Param("example") ExamQuestionExample example);

    int updateByExample(@Param("record") ExamQuestion record, @Param("example") ExamQuestionExample example);

    int updateByPrimaryKeySelective(ExamQuestion record);

    int updateByPrimaryKey(ExamQuestion record);
}