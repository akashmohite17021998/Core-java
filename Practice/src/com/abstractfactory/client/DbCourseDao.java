package com.abstractfactory.client;

public class DbCourseDao implements Dao {

	@Override
	public void insert() {
		System.out.println("DbCourseDao - course details inserted to data base.");
	}

}
