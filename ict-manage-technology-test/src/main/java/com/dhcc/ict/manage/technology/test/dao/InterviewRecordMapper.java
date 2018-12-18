package com.dhcc.ict.manage.technology.test.dao;

import com.dhcc.ict.manage.technology.test.pojo.InterviewRecord;
import com.dhcc.ict.manage.technology.test.pojo.InterviewRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterviewRecordMapper {
    int countByExample(InterviewRecordExample example);

    int deleteByExample(InterviewRecordExample example);

    int deleteByPrimaryKey(Integer interviewRecordId);

    int insert(InterviewRecord record);

    int insertSelective(InterviewRecord record);

    List<InterviewRecord> selectByExampleWithBLOBs(InterviewRecordExample example);

    List<InterviewRecord> selectByExample(InterviewRecordExample example);

    InterviewRecord selectByPrimaryKey(Integer interviewRecordId);

    int updateByExampleSelective(@Param("record") InterviewRecord record, @Param("example") InterviewRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") InterviewRecord record, @Param("example") InterviewRecordExample example);

    int updateByExample(@Param("record") InterviewRecord record, @Param("example") InterviewRecordExample example);

    int updateByPrimaryKeySelective(InterviewRecord record);

    int updateByPrimaryKeyWithBLOBs(InterviewRecord record);

    int updateByPrimaryKey(InterviewRecord record);
}