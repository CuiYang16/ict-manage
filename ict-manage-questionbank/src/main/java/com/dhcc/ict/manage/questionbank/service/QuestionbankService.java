package com.dhcc.ict.manage.questionbank.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dhcc.ict.manage.questionbank.dao.TechnologyChooseOneMapper;
import com.dhcc.ict.manage.questionbank.dao.TechnologyTypeMapper;
import com.dhcc.ict.manage.questionbank.excelutil.Excel;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyChooseOne;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyType;

@Service
public class QuestionbankService {
	private final static String XLS = "xls";
	private final static String XLSX = "xlsx";

	@Autowired
	private TechnologyChooseOneMapper technologyChooseOneMapper;
	
	@Autowired
	private TechnologyTypeMapper technologyTypeMapper;

	Excel<TechnologyChooseOne> excel = new Excel();
    
	//@SuppressWarnings( "resource" )
	public Integer importExcel(MultipartFile upfile) {
		List lists = null;
		List<Integer> typelist = null;
		
		try {
			lists = excel.importExcel(upfile);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int k = 0;
		for (int i = 0; i < lists.size(); i++) {
			
			List ll =  (List) lists.get(i);
			//Integer yl = (Integer) ll.get(ll.size()-1);
			//System.out.println("最后一列元素"+ll.get(ll.size()-1));
			//获取最后一列元素
			String yilie = (String) ll.get(ll.size()-1);
			
		int int1 = Integer.parseInt(yilie);
			 typelist = technologyTypeMapper.selectByid();
			for(Integer sTechnologyType : typelist) {
				//System.out.println("---------id的值"+sTechnologyType);
				if(int1 != sTechnologyType) {
					System.out.println("无此类别题库，请重新导入");
					
					break;
				}
			}
			
			/*
			 * Student student=new Student(); List list= (List) lists.get(i);
			 * student.setName((String)list.get(0)); student.setSex((String)list.get(1));
			 * student.setAge(Integer.parseInt((String)list.get(2)));
			 */
			try {
				List list = (List) lists.get(i);
				technologyChooseOneMapper.insertChooseOne(list);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				k++;
				e.printStackTrace();
			}
		}
		System.out.println("失败" + k + "条");
		return 1;

	}

}

