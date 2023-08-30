package com.adapter.test;

import com.adapter.service.AccuWheatherServiceImpl;

public class Test {

	public static void main(String[] args) {
		AccuWheatherServiceImpl  a = new AccuWheatherServiceImpl();
		String s = a.showTemp("pune");
		System.out.println(s);
	}
}
