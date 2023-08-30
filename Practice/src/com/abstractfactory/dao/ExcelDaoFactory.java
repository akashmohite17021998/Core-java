package com.abstractfactory.dao;

import com.abstractfactory.client.Dao;
import com.abstractfactory.client.ExcelCourseDao;
import com.abstractfactory.client.ExcelStudentDao;

public class ExcelDaoFactory implements DaoFactory {

	@Override
	public Dao createDao(String type) {
		
		Dao dao = null;
		
		if(type.equalsIgnoreCase("student")) {
			dao = new ExcelStudentDao();
		}else if(type.equalsIgnoreCase("course")) {
			dao = new ExcelCourseDao();
		}else {
			throw new IllegalArgumentException();
		}
		
		return dao;
		
	}

}
