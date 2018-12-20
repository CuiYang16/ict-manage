package com.dhcc.ict.manage.questionbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.ict.manage.questionbank.dao.TechnologyChooseOneMapper;
import com.dhcc.ict.manage.questionbank.dao.TechnologyTypeMapper;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyType;
import com.dhcc.ict.manage.questionbank.pojo.QuestionBankOne;

@Service
public class ShowListService {
	@Autowired
	private TechnologyTypeMapper technologyTypeMapper;

	@Autowired
	private TechnologyChooseOneMapper technologyChooseOneMapper;

	public List<TechnologyType> technologyOnelist() {

		return technologyTypeMapper.selectOneTechnology();
	}

	// 查询单选题库及类别俩表
	public List<QuestionBankOne> questionOnelist() {

		List<QuestionBankOne> list = technologyChooseOneMapper.selectOneTechnology();
		/*for (QuestionBankOne q : list) {
			System.out.println(q);
		}*/
		return list;
	}
}
