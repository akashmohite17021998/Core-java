package com.abstractfactory.client;

public class DbStudentDao implements Dao {

	@Override
	public void insert() {
		
		System.out.println("DbStudentDao - Student info inserted to data base.");

	}

}
