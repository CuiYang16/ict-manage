package com.dhcc.ict.manage.questionbank.dao;

import com.dhcc.ict.manage.questionbank.pojo.TechnologyType;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TechnologyTypeMapper {
    int countByExample(TechnologyTypeExample example);

    int deleteByExample(TechnologyTypeExample example);

    int insert(TechnologyType record);

    int insertSelective(TechnologyType record);

    List<TechnologyType> selectByExample(TechnologyTypeExample example);

    int updateByExampleSelective(@Param("record") TechnologyType record, @Param("example") TechnologyTypeExample example);

    int updateByExample(@Param("record") TechnologyType record, @Param("example") TechnologyTypeExample example);

	List<Integer> selectByid();
	//查询单选题库
	/*List<TechnologyType> selectOneTechnology();*/
    //查询类别表
	List<TechnologyType> selectType();

	void insertTypeName(String technologyTypeName);

}