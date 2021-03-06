package com.dhcc.ict.manage.questionbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.ict.manage.questionbank.dao.TechnologyChooseMuchMapper;
import com.dhcc.ict.manage.questionbank.dao.TechnologyChooseOneMapper;
import com.dhcc.ict.manage.questionbank.dao.TechnologyJudgeMapper;
import com.dhcc.ict.manage.questionbank.dao.TechnologyTypeMapper;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyType;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.dhcc.ict.manage.questionbank.pojo.QuestionBankJudge;
import com.dhcc.ict.manage.questionbank.pojo.QuestionBankMuch;
import com.dhcc.ict.manage.questionbank.pojo.QuestionBankOne;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyChooseMuch;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyChooseOne;
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

	/*public List<TechnologyType> technologyOnelist() {

		return technologyTypeMapper.selectOneTechnology();
	}*/

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
	//根据id删除多选一条数据
	public void qusetionMuchdelete(Integer chooseMuchId) {
		technologyChooseMuchMapper.deleteByPrimaryKey(chooseMuchId);
		
	}
	 //删除多条多选数据
	public void qusetionMuchDeleteAll(Integer[] ids) {
		technologyChooseMuchMapper.qusetionMuchDeleteAll(ids);
		
	}
	//根据id删除判断题一条数据
	public void qusetionJudgedelete(Integer technologyJudgeId) {
		technologyJudgeMapper.deleteByPrimaryKey(technologyJudgeId);
		
	}
	//根据id删除多条判断题数据
	public void qusetionJudgeDeleteAll(Integer[] ids) {
		technologyJudgeMapper.qusetionJudgeDeleteAll(ids);
		
	}
    //添加数据到单选表题库
	public void addone(String[] onedetail) {
		technologyChooseOneMapper.insertonedetail(onedetail);
		
	}
    
	//通过单选id查询并显示到模态框
	public TechnologyChooseOne selectonemodalid(Integer chooseOneId) {
		return technologyChooseOneMapper.selectByPrimaryKey(chooseOneId);
	}
	//通过单选id查询并显示到模态框  修改保存实现
	public void savaonemodal(TechnologyChooseOne record) {
		technologyChooseOneMapper.updateByPrimaryKeySelective(record);
		
	}
	//通过多选id查询并显示到模态框
	public TechnologyChooseMuch selectmuchmodalid(Integer chooseMuchId) {
		
		return technologyChooseMuchMapper.selectByPrimaryKey(chooseMuchId);
	}
	//通过多选id查询并显示到模态框  修改保存实现
	public void savemuchmodal(TechnologyChooseMuch record) {
		technologyChooseMuchMapper.updateByPrimaryKeySelective(record);
		
	}
	//通过判断id查询并显示到模态框
	public TechnologyJudge selectjudgemodalid(Integer technologyJudgeId) {
		
		return technologyJudgeMapper.selectByPrimaryKey(technologyJudgeId);
	}
	//通过判断id查询并显示到模态框  修改保存实现
	public void savejudgemodal(TechnologyJudge record) {
		technologyJudgeMapper.updateByPrimaryKeySelective(record);
		
	}
	//添加单选题
	public void addonedetail(TechnologyChooseOne record) {
		technologyChooseOneMapper.insertSelective(record);
			
		}
	//添加多选题
	public void addmuchdetail(TechnologyChooseMuch record) {
		technologyChooseMuchMapper.insertSelective(record);
		
	}
	//添加判断题
	public void addJudgeDetail(TechnologyJudge record) {
		technologyJudgeMapper.insertSelective(record);
		
	}
	// 查询类别表
	public List<TechnologyType> selectType() {
		return technologyTypeMapper.selectType();
	}
    //通过扩展类根据类别id查询单选题库
	public List<QuestionBankOne> oneSelectType(Integer technologyTypeId) {
		return technologyChooseOneMapper.selectOneTypeTechnology(technologyTypeId);
	}
	// 查询多选题库id按类别查找
	public List<QuestionBankMuch> muchSelectType(Integer technologyTypeId) {
		return technologyChooseMuchMapper.selectMuchTypeTechnology(technologyTypeId);
	}
	// 查询判断题库id按类别查找
	public List<QuestionBankJudge> judgeSelectType(Integer technologyTypeId) {
		return technologyJudgeMapper.selectJudgeTypeTechnology(technologyTypeId);
	}
	//添加类别名称
	public void addtype(String technologyTypeName) {
		technologyTypeMapper.insertTypeName(technologyTypeName);
		
	}

	public Object findAllUser(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
        List<QuestionBankOne> users = technologyChooseOneMapper.selectOneTechnology();
        PageInfo result = new PageInfo(users);
        return result;
	}

	
}
