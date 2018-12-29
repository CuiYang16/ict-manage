package com.dhcc.ict.manage.questionbank.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.dhcc.ict.manage.questionbank.pojo.TechnologyType;
import com.dhcc.ict.manage.questionbank.pojo.QuestionBankJudge;
import com.dhcc.ict.manage.questionbank.pojo.QuestionBankMuch;
import com.dhcc.ict.manage.questionbank.pojo.QuestionBankOne;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyChooseMuch;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyChooseOne;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyJudge;
import com.dhcc.ict.manage.questionbank.service.QuestionbankJudgeService;
import com.dhcc.ict.manage.questionbank.service.QuestionbankMuchService;
import com.dhcc.ict.manage.questionbank.service.QuestionbankService;
import com.dhcc.ict.manage.questionbank.service.ShowListService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/show")
public class ShowListController {
	@Autowired
	private ShowListService showListService;
	
	//excel  service 注入
	@Autowired
	private QuestionbankService questionbankService;
	@Autowired
	private QuestionbankMuchService questionbankMuchService;
	@Autowired
	private QuestionbankJudgeService questionbankJudgeService;

	// 去单选题库页面
	@RequestMapping("/gooneym")
	public String strone() {
		return "showTechnology";

	}

	// 去多选题库页面
	@RequestMapping("/gomuchym")
	public String showchoosemuch() {
		return "showchoosemuch";

	}

	// 去判断题库页面
	@RequestMapping("/gojudgeym")
	public String showjudge() {
		return "showjudge";

	}

	// 查询单选题库
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping("onetype") public List<TechnologyType> technologyOnelist(){
	 * return showListService.technologyOnelist();
	 * 
	 * }
	 */

	// 查询单选题库
	/*@ResponseBody
	@RequestMapping("/one")
	public List<QuestionBankOne> qusetionOnelist() {	
		List<QuestionBankOne> list = showListService.questionOnelist();
		return list;
	}*/
	/**
	 * 查询单选题库
	 * @param pageNum 当前页数
	 * @return  数据库的数据集合
	 */
	@ResponseBody
	@RequestMapping("/one")
	public Map<String,Object> qusetionOnelist(@RequestParam(defaultValue="1",required=true,value="pageNum") Integer pageNum) {
		Map<String,Object> map = new HashMap<>();
		System.out.println("ddddddddddddd");
		Integer pageSize=3;  //当前页数显示的数据条数
		PageHelper.startPage(pageNum, pageSize);
		List<QuestionBankOne> list = showListService.questionOnelist();
		PageInfo<QuestionBankOne> page=new PageInfo<QuestionBankOne>(list);
		map.put("onelist",list);
		map.put("onepage",page);
		//map.put(key, value)
		return map;
	}
	
	// 查询多选题库
	/*@ResponseBody
	@RequestMapping("/much")
	public List<QuestionBankMuch> qusetionMuchlist() {
		List<QuestionBankMuch> listmuch = showListService.qusetionMuchlist();
		return listmuch;
	}*/
	/**查询多选题库
	* @param pageNo 当前页数
	 * @return  数据库的数据集合
	 */
	@ResponseBody
	@RequestMapping("/much")
	public  Map<String,Object> qusetionMuchlist(@RequestParam(defaultValue="1",required=true,value="muchpageNum") Integer muchpageNum) {
		Map<String,Object> map = new HashMap<>();
		Integer pageSize=3;
		PageHelper.startPage(muchpageNum, pageSize);
		List<QuestionBankMuch> listmuch = showListService.qusetionMuchlist();
		PageInfo<QuestionBankMuch> page=new PageInfo<QuestionBankMuch>(listmuch);
		map.put("muchlist",listmuch);
		map.put("muchpage",page);
		return map;
	}

	// 查询判断题库
	/*@ResponseBody
	@RequestMapping("/judge")
	public List<QuestionBankJudge> qusetionJudgelist() {
		List<QuestionBankJudge> listjudge = showListService.qusetionJudgelist();
		return listjudge;
	}*/
	
	/**查询判断题库
	* @param pageNo 当前页数
	 * @return  数据库的数据集合
	 */
	@ResponseBody
	@RequestMapping("/judge")
	public Map<String, Object> qusetionJudgelist(@RequestParam(defaultValue="1",required=true,value="judgepageNum") Integer judgepageNum) {
		Map<String, Object> map = new HashMap<>();
		Integer pageSize = 3;
		PageHelper.startPage(judgepageNum,pageSize);
		List<QuestionBankJudge> listjudge = showListService.qusetionJudgelist();
		PageInfo<QuestionBankJudge> page = new PageInfo<QuestionBankJudge>(listjudge);
		map.put("judgelist", listjudge);
		map.put("judgepage", page);
		return map;
	}
	/**
	 * 
	 * @param chooseOneId 删除单个选择题的id
	 * @return 返回页面的$.get的值
	 */
	@RequestMapping("onedelete")
	@ResponseBody
	public String qusetionOnedelete(Integer chooseOneId) {
		if (chooseOneId == null) {
			return "error";
		} else {
			showListService.qusetionOnedelete(chooseOneId);
			return "ok";
		}
	}

	/**
	 * 
	 * @param ids 批量删除和全选删除选择题的id
	 * @return 返回页面的data值
	 */
	@RequestMapping("onedeleteall")
	@ResponseBody
	public String qusetionOneDeleteAll(Integer[] ids) {
		System.out.println("hhhhhhhhhhhhh");
		if (ids == null) {
			return "error";
		} else {
			showListService.qusetionOneDeleteAll(ids);
			return "ok";
		}
	}

	/**
	 * 
	 * @param chooseMuchId 删除单个多选择题的id
	 * @return 返回页面的$.get的值
	 */
	@RequestMapping("/muchdelete")
	@ResponseBody
	public String qusetionMuchdelete(Integer chooseMuchId) {
		if (chooseMuchId == null) {
			System.out.println("sssssssssss");
			return "error";
		} else {
			showListService.qusetionMuchdelete(chooseMuchId);
			System.out.println("ccccccccc");
			return "ok";
		}
	}

	/**
	 * 
	 * @param ids 批量删除和全选删除多选择题的id
	 * @return 返回页面的data值
	 */
	@RequestMapping("muchdeleteall")
	@ResponseBody
	public String qusetionMuchDeleteAll(Integer[] ids) {
		System.out.println("hhhhhhhhhhhhh");
		if (ids == null) {
			return "error";
		} else {
			showListService.qusetionMuchDeleteAll(ids);
			return "ok";
		}
	}

	/**
	 * 
	 * @param technologyJudgeId 删除单个判断题的id
	 * @return 返回页面的$.get的值
	 */
	@RequestMapping("/judgedelete")
	@ResponseBody
	public String qusetionJudgedelete(Integer technologyJudgeId) {
		if (technologyJudgeId == null) {
			System.out.println("sssssssssss");
			return "error";
		} else {
			showListService.qusetionJudgedelete(technologyJudgeId);
			System.out.println("ccccccccc");
			return "ok";
		}
	}

	/**
	 * 
	 * @param ids 批量删除和全选删除判断题的id
	 * @return 返回页面的data值
	 */
	@RequestMapping("judgedeleteall")
	@ResponseBody
	public String qusetionJudgeDeleteAll(Integer[] ids) {
		System.out.println("hhhhhhhhhhhhh");
		if (ids == null) {
			return "error";
		} else {
			showListService.qusetionJudgeDeleteAll(ids);
			return "ok";
		}
	}

	@RequestMapping("goaddone")
	public String goaddone() {
		return "onepageadd";
	}

	// 到整合的页面
	@RequestMapping("indextechnology")
	public String indextechnology() {
		return "indextechnology";
	}

	// 通过单选id查询并显示到模态框
	@RequestMapping("selectonemodalid")
	@ResponseBody
	public TechnologyChooseOne selectonemodalid(Integer onemodalid) {
		TechnologyChooseOne technologyChooseOne = showListService.selectonemodalid(onemodalid);
		return technologyChooseOne;
	}

	// 通过单选id查询并显示到模态框 修改保存实现
	@RequestMapping("savaonemodal")
	@ResponseBody
	public String savaonemodal(TechnologyChooseOne technologyChooseOne) {
		showListService.savaonemodal(technologyChooseOne);
		System.out.println("ggggggggggggg");
		return "ok";
	}

	// 通过多选id查询并显示到模态框
	@RequestMapping("selectmuchmodalid")
	@ResponseBody
	public TechnologyChooseMuch selectmuchmodalid(Integer muchmodalid) {
		TechnologyChooseMuch technologyChooseMuch = showListService.selectmuchmodalid(muchmodalid);
		return technologyChooseMuch;
	}

	// 通过多选id查询并显示到模态框 修改保存实现
	@RequestMapping("savamuchmodal")
	@ResponseBody
	public String savamuchmodal(TechnologyChooseMuch technologyChooseMuch) {
		showListService.savemuchmodal(technologyChooseMuch);
		System.out.println("ggggggggggggg");
		return "ok";
	}

	// 通过多选id查询并显示到模态框
	@RequestMapping("selectjudgemodalid")
	@ResponseBody
	public TechnologyJudge selectjudgemodalid(Integer judgemodalid) {
		TechnologyJudge technologyJudge = showListService.selectjudgemodalid(judgemodalid);
		return technologyJudge;
	}

	// 通过多选id查询并显示到模态框 修改保存实现
	@RequestMapping("savajudgemodal")
	@ResponseBody
	public String savajudgemodal(TechnologyJudge technologyJudge) {
		showListService.savejudgemodal(technologyJudge);
		System.out.println("ggggggggggggg");
		return "ok";
	}

	// 添加单选题
	@RequestMapping("addonemodal")
	@ResponseBody
	public String addOne(TechnologyChooseOne technologyChooseOne) {

		showListService.addonedetail(technologyChooseOne);

		return "ok";
	}

	// 添加多选题
	@RequestMapping("addmuchmodal")
	@ResponseBody
	public String addMuch(TechnologyChooseMuch technologyChooseMuch) {

		showListService.addmuchdetail(technologyChooseMuch);

		return "ok";
	}

	// 添加判断题
	@RequestMapping("addjudgemodal")
	@ResponseBody
	public String addJudge(TechnologyJudge technologyJudge) {
		showListService.addJudgeDetail(technologyJudge);
		return "ok";
	}

	// 查询类别表
	@RequestMapping("/selecttype")
	@ResponseBody
	public List<TechnologyType> selectType() {
		List<TechnologyType> list = showListService.selectType();
		return list;
	}

	// 查询单选题库按类别查找
	/*@ResponseBody
	@RequestMapping("/oneselecttype")
	public List<QuestionBankOne> oneSelectType(Integer technologyTypeId) {
		System.out.println(technologyTypeId);
		List<QuestionBankOne> list = showListService.oneSelectType(technologyTypeId);
		return list;
	}*/
	
	// 查询单选题库按类别查找
	@ResponseBody
	@RequestMapping("/oneselecttype")
	public Map<String,Object> oneSelectType(Integer technologyTypeId,@RequestParam(defaultValue="1",required=true,value="pageNum") Integer pageNum) {
		Map<String,Object> map = new HashMap<>();
		System.out.println("onelllllllllbbbbbbbb");
		System.out.println(technologyTypeId);
		Integer pageSize=3;  //当前页数显示的数据条数
		PageHelper.startPage(pageNum, pageSize);
		List<QuestionBankOne> list = showListService.oneSelectType(technologyTypeId);
		PageInfo<QuestionBankOne> page=new PageInfo<QuestionBankOne>(list);
		map.put("onelist",list);
		map.put("onepage",page);
		return map;
	}
	// 查询多选题库按类别查找
		/*@ResponseBody
		@RequestMapping("/muchselecttype")
		public List<QuestionBankMuch> muchSelectType(Integer technologyTypeId) {
			System.out.println(technologyTypeId);
			List<QuestionBankMuch> list = showListService.muchSelectType(technologyTypeId);
			return list;
		}*/
	// 查询多选题库按类别查找
	@ResponseBody
	@RequestMapping("/muchselecttype")
	public Map<String,Object> muchSelectType(Integer technologyTypeId,@RequestParam(defaultValue="1",required=true,value="muchpageNum") Integer muchpageNum) {
		Map<String,Object> map = new HashMap<>();
		System.out.println("muchlllllllllbbbbbbbb");
		System.out.println(technologyTypeId);
		Integer pageSize=3;  //当前页数显示的数据条数
		PageHelper.startPage(muchpageNum, pageSize);
		List<QuestionBankMuch> list = showListService.muchSelectType(technologyTypeId);
		PageInfo<QuestionBankMuch> page=new PageInfo<QuestionBankMuch>(list);
		map.put("muchlist",list);
		map.put("muchpage",page);
		return map;
	}
		
		// 查询判断题库按类别查找
		/*@ResponseBody
		@RequestMapping("/judgeselecttype")
		public List<QuestionBankJudge> judgeSelectType(Integer technologyTypeId) {
			System.out.println(technologyTypeId);
			List<QuestionBankJudge> list = showListService.judgeSelectType(technologyTypeId);
			return list;
		}*/
	// 查询判断题库按类别查找
	@ResponseBody
	@RequestMapping("/judgeselecttype")
	public Map<String,Object> judgeSelectType(Integer technologyTypeId,@RequestParam(defaultValue="1",required=true,value="judgepageNum") Integer judgepageNum) {
		Map<String,Object> map = new HashMap<>();
		System.out.println(technologyTypeId);
		System.out.println("muchlllllllllbbbbbbbb");
		Integer pageSize=3;  //当前页数显示的数据条数
		PageHelper.startPage(judgepageNum, pageSize);
		List<QuestionBankJudge> list = showListService.judgeSelectType(technologyTypeId);
		PageInfo<QuestionBankJudge> page=new PageInfo<QuestionBankJudge>(list);
		map.put("judgelist",list);
		map.put("judgepage",page);
		return map;
	}
		
		//添加类别名称
		@RequestMapping("addtype")
		@ResponseBody
		public String addType(String technologyTypeName) {
			if (technologyTypeName.equals(" ") || technologyTypeName==null) {
				return "error";
			}else {
				showListService.addtype(technologyTypeName);
				return "ok";
			}
		}
		
		
		//导入单选题
		@RequestMapping(value="/importOneExcel",method=RequestMethod.POST)
		public String importExcel(MultipartFile upfile) throws Exception {
	        if(upfile.isEmpty()){  
	            System.out.println("文件不能为空");
	         }
			
			try {
				Integer num=questionbankService.importExcel(upfile);
			} catch (Exception e) {
				// TODO: handle exception
				//System.out.println(e.getMessage());
				
				return "leadingexcel";
			}
			return "leadingexcelsssss";
		}
		
		//导入多选题
		@RequestMapping(value="/importMuchExcel",method=RequestMethod.POST)
		public String importMuchExcel(MultipartFile upfile) throws Exception{
			if (upfile.isEmpty()) {
				System.out.println("文件不能为空");
				
			}
			questionbankMuchService.importMuchExcel(upfile);
			return "leadingexcelsssss";
		}
		
		//导入判断题
			@RequestMapping(value="/importJudgeExcel",method=RequestMethod.POST)
			public String importJudgeExcel(MultipartFile upfile) throws Exception{
				if (upfile.isEmpty()) {
					System.out.println("文件不能为空");
					
				}
				questionbankJudgeService.importJudgeExcel(upfile);
				return "leadingexcelsssss";
			}
		
		

}
