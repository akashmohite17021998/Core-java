package com.abstractfactory.client;

public class ExcelStudentDao implements Dao {

	@Override
	public void insert() {
		System.out.println("ExcelStudentDao - student inserted in Excel file.");
	}

}
