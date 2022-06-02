package com.test;

import com.dp.Singleton;

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Singleton s =Singleton.getInstance();
		
		Singleton s1 = (Singleton)s.clone();
		
		System.out.println(s.hashCode() + " ======== " + s1.hashCode());
		
	}
}
