package com.nt.test;

import com.nt.dao.DAO;
import com.nt.dao.DBStudentDAO;
import com.nt.factory.DAOFactory;
import com.nt.factory.DAOFactoryCreator;
import com.nt.factory.DBDAOFactory;
import com.nt.factory.ExcelDAOFactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		DAOFactory factory = DAOFactoryCreator.buildDAOFactory("DB");
		DAO studDAO = factory.createDAO("student");
		DAO courseDAO = factory.createDAO("course");
		studDAO.insert();
		System.out.println("====================");
		courseDAO.insert();
	}
}
