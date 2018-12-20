package com.dhcc.ict.manage.questionbank.dao;

import com.dhcc.ict.manage.questionbank.pojo.TechnologyChooseOne;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyChooseOneExample;
import com.dhcc.ict.manage.questionbank.pojo.QuestionBankOne;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TechnologyChooseOneMapper {
    int countByExample(TechnologyChooseOneExample example);

    int deleteByExample(TechnologyChooseOneExample example);

    int deleteByPrimaryKey(Integer chooseOneId);

    int insert(TechnologyChooseOne record);

    int insertSelective(TechnologyChooseOne record);

    List<TechnologyChooseOne> selectByExample(TechnologyChooseOneExample example);

    TechnologyChooseOne selectByPrimaryKey(Integer chooseOneId);

    int updateByExampleSelective(@Param("record") TechnologyChooseOne record, @Param("example") TechnologyChooseOneExample example);

    int updateByExample(@Param("record") TechnologyChooseOne record, @Param("example") TechnologyChooseOneExample example);

    int updateByPrimaryKeySelective(TechnologyChooseOne record);

    int updateByPrimaryKey(TechnologyChooseOne record);
     
    //添加单选题
	void insertChooseOne(List list);
    //通过扩展类查询单选题和类别 
	List<QuestionBankOne> selectOneTechnology();
	
	
	
}