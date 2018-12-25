package com.dhcc.ict.manage.examanalysis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.ict.manage.examanalysis.dao.ExamRecordMapper;
import com.dhcc.ict.manage.examanalysis.pojo.ExamRecord;

@Service
public class ExamRecordService {

	@Autowired
	ExamRecordMapper examRecordMapper;
	public int analysisScore(Integer examReordid) {
		return examRecordMapper.analysisScore(examReordid);
			
	}

}
