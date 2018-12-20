package com.dhcc.ict.manage.questionbank.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dhcc.ict.manage.questionbank.dao.TechnologyChooseMuchMapper;
import com.dhcc.ict.manage.questionbank.excelutil.Excel;
import com.dhcc.ict.manage.questionbank.pojo.TechnologyChooseMuch;

@Service
public class QuestionbankMuchService {
	private final static String XLS = "xls";
	private final static String XLSX = "xlsx";
	@Autowired
	private TechnologyChooseMuchMapper technologyChooseMuchMapper;
	
	Excel<TechnologyChooseMuch> excel = new Excel<>();

	public void importMuchExcel(MultipartFile upfile) {
		List lists = null;
		try {
			lists = excel.importExcel(upfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int k = 0;
		for(int i = 0; i<lists.size();i++) {
			List list = (List) lists.get(i);
			technologyChooseMuchMapper.insertChooseMuch(list);
			k++;
		}
		
		System.out.println("成功数量"+k);
	}

}
