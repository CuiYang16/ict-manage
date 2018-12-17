package com.dhcc.ict.manage.technology.test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.dhcc.ict.manage.technology.test.pojo.TechnologyTest;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyTestExample;

public interface TechnologyTestMapper {
    int countByExample(TechnologyTestExample example);

    int deleteByExample(TechnologyTestExample example);

    int deleteByPrimaryKey(Integer technologyTestId);

    int insert(TechnologyTest record);

    int insertSelective(TechnologyTest record);

    List<TechnologyTest> selectByExample(TechnologyTestExample example);

    TechnologyTest selectByPrimaryKey(Integer technologyTestId);

    int updateByExampleSelective(@Param("record") TechnologyTest record, @Param("example") TechnologyTestExample example);

    int updateByExample(@Param("record") TechnologyTest record, @Param("example") TechnologyTestExample example);

    int updateByPrimaryKeySelective(TechnologyTest record);

    int updateByPrimaryKey(TechnologyTest record);
}