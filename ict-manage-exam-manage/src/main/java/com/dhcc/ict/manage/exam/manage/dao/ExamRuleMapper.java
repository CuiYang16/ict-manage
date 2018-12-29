package com.dhcc.ict.manage.exam.manage.dao;

import com.dhcc.ict.manage.exam.manage.pojo.ExamRule;
import com.dhcc.ict.manage.exam.manage.pojo.ExamRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamRuleMapper {
    int countByExample(ExamRuleExample example);

    int deleteByExample(ExamRuleExample example);

    int deleteByPrimaryKey(Integer examRuleId);

    int insert(ExamRule record);

    int insertSelective(ExamRule record);

    List<ExamRule> selectByExample(ExamRuleExample example);

    ExamRule selectByPrimaryKey(Integer examRuleId);

    int updateByExampleSelective(@Param("record") ExamRule record, @Param("example") ExamRuleExample example);

    int updateByExample(@Param("record") ExamRule record, @Param("example") ExamRuleExample example);

    int updateByPrimaryKeySelective(ExamRule record);

    int updateByPrimaryKey(ExamRule record);
}