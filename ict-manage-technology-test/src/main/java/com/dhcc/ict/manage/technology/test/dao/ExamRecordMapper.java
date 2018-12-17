package com.dhcc.ict.manage.technology.test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.dhcc.ict.manage.technology.test.pojo.ExamRecord;
import com.dhcc.ict.manage.technology.test.pojo.ExamRecordExample;

public interface ExamRecordMapper {
    int countByExample(ExamRecordExample example);

    int deleteByExample(ExamRecordExample example);

    int deleteByPrimaryKey(Integer examRecordId);

    int insert(ExamRecord record);

    int insertSelective(ExamRecord record);

    List<ExamRecord> selectByExample(ExamRecordExample example);

    ExamRecord selectByPrimaryKey(Integer examRecordId);

    int updateByExampleSelective(@Param("record") ExamRecord record, @Param("example") ExamRecordExample example);

    int updateByExample(@Param("record") ExamRecord record, @Param("example") ExamRecordExample example);

    int updateByPrimaryKeySelective(ExamRecord record);

    int updateByPrimaryKey(ExamRecord record);
}