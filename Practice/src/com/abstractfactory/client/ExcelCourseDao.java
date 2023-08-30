package com.abstractfactory.client;

public class ExcelCourseDao implements Dao {

	@Override
	public void insert() {
		System.out.println("ExcelCourseDao - course inserted in Excel file.");
	}

}
