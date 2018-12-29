package com.dhcc.ict.manage.technology.test.dao;

import com.dhcc.ict.manage.technology.test.pojo.TechnologyType;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TechnologyTypeMapper {
    int countByExample(TechnologyTypeExample example);

    int deleteByExample(TechnologyTypeExample example);

    int deleteByPrimaryKey(Integer technologyTypeId);

    int insert(TechnologyType record);

    int insertSelective(TechnologyType record);

    List<TechnologyType> selectByExample(TechnologyTypeExample example);

    TechnologyType selectByPrimaryKey(Integer technologyTypeId);

    int updateByExampleSelective(@Param("record") TechnologyType record, @Param("example") TechnologyTypeExample example);

    int updateByExample(@Param("record") TechnologyType record, @Param("example") TechnologyTypeExample example);

    int updateByPrimaryKeySelective(TechnologyType record);

    int updateByPrimaryKey(TechnologyType record);
}