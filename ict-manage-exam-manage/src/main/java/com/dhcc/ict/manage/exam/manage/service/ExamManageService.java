package com.dhcc.ict.manage.exam.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.ict.manage.exam.manage.dao.ExamQuestionMapper;
import com.dhcc.ict.manage.exam.manage.dao.ExamRecordMapper;
import com.dhcc.ict.manage.exam.manage.pojo.ExamRecord;
import com.dhcc.ict.manage.exam.manage.pojo.ExamRecordExample;

@Service
public class ExamManageService {

	private ExamRecordExample examRecordExample;
	@Autowired
	private ExamRecordMapper examRecordMapper;
	@Autowired
	private ExamQuestionMapper examQuestionMapper;

	public List<ExamRecord> getExamRecord(Integer userId) {
		examRecordExample = new ExamRecordExample();
		examRecordExample.createCriteria().andUserIdEqualTo(userId);
		List<ExamRecord> examRecordList = examRecordMapper.selectByExampleWithBLOBs(examRecordExample);
		return examRecordList;
	}

}
