package com.abstractfactory.factory;

import com.abstractfactory.client.Dao;
import com.abstractfactory.dao.DaoFactory;
import com.abstractfactory.dao.DaoFactoryCreator;

public class ClientTest {

	public static void main(String[] args) {
		
		DaoFactory factory = DaoFactoryCreator.createDaoFactory("db");
		
		Dao dao = factory.createDao("student");
		
		Dao dao1 = factory.createDao("course");
		
		dao.insert();
		
		dao1.insert();
	}
}
