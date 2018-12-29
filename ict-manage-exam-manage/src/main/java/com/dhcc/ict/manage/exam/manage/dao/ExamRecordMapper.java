package com.dhcc.ict.manage.exam.manage.dao;

import com.dhcc.ict.manage.exam.manage.pojo.ExamRecord;
import com.dhcc.ict.manage.exam.manage.pojo.ExamRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamRecordMapper {
    int countByExample(ExamRecordExample example);

    int deleteByExample(ExamRecordExample example);

    int deleteByPrimaryKey(Integer examRecordId);

    int insert(ExamRecord record);

    int insertSelective(ExamRecord record);

    List<ExamRecord> selectByExampleWithBLOBs(ExamRecordExample example);

    List<ExamRecord> selectByExample(ExamRecordExample example);

    ExamRecord selectByPrimaryKey(Integer examRecordId);

    int updateByExampleSelective(@Param("record") ExamRecord record, @Param("example") ExamRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") ExamRecord record, @Param("example") ExamRecordExample example);

    int updateByExample(@Param("record") ExamRecord record, @Param("example") ExamRecordExample example);

    int updateByPrimaryKeySelective(ExamRecord record);

    int updateByPrimaryKeyWithBLOBs(ExamRecord record);

    int updateByPrimaryKey(ExamRecord record);
}