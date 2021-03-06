package com.dhcc.ict.manage.questionbank.dao;

import com.dhcc.ict.manage.questionbank.pojo.QuestionBankJudge;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyJudge;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyJudgeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TechnologyJudgeMapper {
    int countByExample(TechnologyJudgeExample example);

    int deleteByExample(TechnologyJudgeExample example);
    //删除单个判断题
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
    //查询判断和类别
	List<QuestionBankJudge> selectJudgeTechnology();
    //批量删除判断题
	void qusetionJudgeDeleteAll(Integer[] ids);
	// 查询判断题库id按类别查找
	List<QuestionBankJudge> selectJudgeTypeTechnology(Integer technologyTypeId);
}