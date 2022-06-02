package com.test;

import java.lang.reflect.Constructor;


import com.dp.Singleton;

public class ReflectionAPI {

	public static void main(String[] args) {
		
//		try {
//			Class c = Class.forName("com.dp.Singleton");
//			
//			Constructor cons[] = c.getDeclaredConstructors();
//			
//			cons[0].setAccessible(true);
//			
//			Singleton s1 = (Singleton)cons[0].newInstance();
//			Singleton s2 = (Singleton)cons[0].newInstance();
//			Singleton s3 = Singleton.getInstance();
//			
//			System.out.println(s1.hashCode() + "=====" + s2.hashCode() + "=====" + s3.hashCode()
//			);
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			
			Class clazz = Class.forName("com.dp.Singleton");
			
			Constructor[] cons = clazz.getDeclaredConstructors();
			
			cons[0].setAccessible(true);
			
			Singleton s1 = (Singleton)cons[0].newInstance();
			
			Singleton s2 = (Singleton)cons[0].newInstance();
			
			Singleton s3 = Singleton.getInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
