package com.dhcc.ict.manage.questionbank.dao;

import com.dhcc.ict.manage.questionbank.pojo.TechnologyJudge;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyJudgeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TechnologyJudgeMapper {
    int countByExample(TechnologyJudgeExample example);

    int deleteByExample(TechnologyJudgeExample example);

    int deleteByPrimaryKey(Integer technologyJudgeId);

    int insert(TechnologyJudge record);

    int insertSelective(TechnologyJudge record);

    List<TechnologyJudge> selectByExample(TechnologyJudgeExample example);

    TechnologyJudge selectByPrimaryKey(Integer technologyJudgeId);

    int updateByExampleSelective(@Param("record") TechnologyJudge record, @Param("example") TechnologyJudgeExample example);

    int updateByExample(@Param("record") TechnologyJudge record, @Param("example") TechnologyJudgeExample example);

    int updateByPrimaryKeySelective(TechnologyJudge record);

    int updateByPrimaryKey(TechnologyJudge record);
    
    //导入判断题
	void insertChooseJudge(List list);
}