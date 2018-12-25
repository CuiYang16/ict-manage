package com.dhcc.ict.manage.examanalysis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.ict.manage.examanalysis.dao.*;
import com.dhcc.ict.manage.examanalysis.pojo.*;



@Service
public class ExamRecordService { 

	@Autowired
	private ExamRecordMapper examRecordMapper ;
	
	public List<ExamRecord> count(Integer userId) {
		return examRecordMapper.count(userId);
			
	}

	public List<ExamRecord> avageScore(Integer totalScore) {
		return examRecordMapper.avageScore(totalScore);
			
	}


}
