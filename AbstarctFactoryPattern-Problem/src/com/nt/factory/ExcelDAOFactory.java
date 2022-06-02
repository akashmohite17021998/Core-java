package com.nt.factory;

import com.nt.dao.DAO;
import com.nt.dao.ExcelCourseDAO;
import com.nt.dao.ExcelStudentDAO;

public class ExcelDAOFactory {

	public static DAO createDAO(String type) {
		DAO dao = null;
		if(type.equalsIgnoreCase("student"))
			dao = new ExcelStudentDAO();
		else if(type.equalsIgnoreCase("course"))
			dao = new ExcelCourseDAO();
		else
			throw new IllegalArgumentException("Invalid DAO type");
		return dao;
	}
}
