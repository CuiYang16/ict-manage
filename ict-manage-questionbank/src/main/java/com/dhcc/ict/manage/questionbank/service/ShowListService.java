package com.dhcc.ict.manage.questionbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.ict.manage.questionbank.dao.TechnologyChooseMuchMapper;
import com.dhcc.ict.manage.questionbank.dao.TechnologyChooseOneMapper;
import com.dhcc.ict.manage.questionbank.dao.TechnologyJudgeMapper;
import com.dhcc.ict.manage.questionbank.dao.TechnologyTypeMapper;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyType;
import com.dhcc.ict.manage.questionbank.pojo.QuestionBankJudge;
import com.dhcc.ict.manage.questionbank.pojo.QuestionBankMuch;
import com.dhcc.ict.manage.questionbank.pojo.QuestionBankOne;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyChooseMuch;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyJudge;

@Service
public class ShowListService {
	@Autowired
	private TechnologyTypeMapper technologyTypeMapper;

	@Autowired
	private TechnologyChooseOneMapper technologyChooseOneMapper;
	
	@Autowired
	private TechnologyChooseMuchMapper technologyChooseMuchMapper;
	
	@Autowired
	private TechnologyJudgeMapper technologyJudgeMapper;

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
 
	//根据id删除单选一条数据
	public int qusetionOnedelete(Integer chooseOneId) {
		return technologyChooseOneMapper.deleteByPrimaryKey(chooseOneId);
		
	}
    //删除多条单选数据
	public void qusetionOneDeleteAll(Integer[] ids) {
		technologyChooseOneMapper.qusetionOneDeleteAll(ids);
		
	}
	// 查询多选题库及类别俩表
	public List<QuestionBankMuch> qusetionMuchlist() {
		// TODO Auto-generated method stub
		return technologyChooseMuchMapper.selectMuchTechnology();
	}
	// 查询判断题库及类别俩表
	public List<QuestionBankJudge> qusetionJudgelist() {
		// TODO Auto-generated method stub
		return technologyJudgeMapper.selectJudgeTechnology();
	}
}