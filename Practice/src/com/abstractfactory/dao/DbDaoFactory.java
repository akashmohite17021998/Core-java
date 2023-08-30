package com.abstractfactory.dao;

import com.abstractfactory.client.Dao;
import com.abstractfactory.client.DbCourseDao;
import com.abstractfactory.client.DbStudentDao;

public class DbDaoFactory implements DaoFactory {

	@Override
	public Dao createDao(String type) {
		
		Dao dao = null;
		
		if(type.equalsIgnoreCase("student")) {
			dao = new DbStudentDao();
		}else if(type.equalsIgnoreCase("course")) {
			dao = new DbCourseDao();
		}else {
			throw new IllegalArgumentException();
		}
		
		return dao;
		
	}

}
