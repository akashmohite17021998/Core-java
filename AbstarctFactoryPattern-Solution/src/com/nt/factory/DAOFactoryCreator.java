package com.nt.factory;

//Abstract factory pattern
public class DAOFactoryCreator {

	public static DAOFactory buildDAOFactory(String type) {
		DAOFactory factory = null;
		if(type.equalsIgnoreCase("DB"))
			factory = new DBDAOFactory();
		else if(type.equalsIgnoreCase("excel"))
			factory = new ExcelDAOFactory();
		else
			throw new IllegalArgumentException("Invalid factory type");
		return factory;
	}
}
