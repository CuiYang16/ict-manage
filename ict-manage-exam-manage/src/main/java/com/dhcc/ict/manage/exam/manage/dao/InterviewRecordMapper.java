package com.dhcc.ict.manage.exam.manage.dao;

import com.dhcc.ict.manage.exam.manage.pojo.InterviewRecord;
import com.dhcc.ict.manage.exam.manage.pojo.InterviewRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterviewRecordMapper {
    int countByExample(InterviewRecordExample example);

    int deleteByExample(InterviewRecordExample example);

    int deleteByPrimaryKey(Integer interviewRecordId);

    int insert(InterviewRecord record);

    int insertSelective(InterviewRecord record);

    List<InterviewRecord> selectByExample(InterviewRecordExample example);

    InterviewRecord selectByPrimaryKey(Integer interviewRecordId);

    int updateByExampleSelective(@Param("record") InterviewRecord record, @Param("example") InterviewRecordExample example);

    int updateByExample(@Param("record") InterviewRecord record, @Param("example") InterviewRecordExample example);

    int updateByPrimaryKeySelective(InterviewRecord record);

    int updateByPrimaryKey(InterviewRecord record);
}