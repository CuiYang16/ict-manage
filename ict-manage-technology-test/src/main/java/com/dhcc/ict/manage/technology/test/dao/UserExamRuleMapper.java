package com.dhcc.ict.manage.technology.test.dao;

import com.dhcc.ict.manage.technology.test.pojo.UserExamRule;
import com.dhcc.ict.manage.technology.test.pojo.UserExamRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserExamRuleMapper {
    int countByExample(UserExamRuleExample example);

    int deleteByExample(UserExamRuleExample example);

    int insert(UserExamRule record);

    int insertSelective(UserExamRule record);

    List<UserExamRule> selectByExample(UserExamRuleExample example);

    int updateByExampleSelective(@Param("record") UserExamRule record, @Param("example") UserExamRuleExample example);

    int updateByExample(@Param("record") UserExamRule record, @Param("example") UserExamRuleExample example);
}