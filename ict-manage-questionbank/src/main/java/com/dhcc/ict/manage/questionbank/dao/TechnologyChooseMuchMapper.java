package com.dhcc.ict.manage.questionbank.dao;

import com.dhcc.ict.manage.questionbank.pojo.QuestionBankMuch;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyChooseMuch;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyChooseMuchExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TechnologyChooseMuchMapper {
    int countByExample(TechnologyChooseMuchExample example);

    int deleteByExample(TechnologyChooseMuchExample example);

    int deleteByPrimaryKey(Integer chooseMuchId);

    int insert(TechnologyChooseMuch record);

    int insertSelective(TechnologyChooseMuch record);

    List<TechnologyChooseMuch> selectByExample(TechnologyChooseMuchExample example);

    TechnologyChooseMuch selectByPrimaryKey(Integer chooseMuchId);

    int updateByExampleSelective(@Param("record") TechnologyChooseMuch record, @Param("example") TechnologyChooseMuchExample example);

    int updateByExample(@Param("record") TechnologyChooseMuch record, @Param("example") TechnologyChooseMuchExample example);

    int updateByPrimaryKeySelective(TechnologyChooseMuch record);

    int updateByPrimaryKey(TechnologyChooseMuch record);
    // 添加多选题
	void insertChooseMuch(List list);
    //查询多选和类别
	List<QuestionBankMuch> selectMuchTechnology();
}