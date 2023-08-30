package com.abstractfactory.dao;

public class DaoFactoryCreator {

	public static DaoFactory createDaoFactory(String name) {
		
		DaoFactory dao = null;
		
		if(name.equalsIgnoreCase("db")) {
			dao = new DbDaoFactory();
		}else if(name.equalsIgnoreCase("excel")) {
			dao = new ExcelDaoFactory();
		}else {
			throw new IllegalArgumentException();
		}
		
		return dao;
		
	}
	
}
