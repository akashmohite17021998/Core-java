package com.test3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.dp3.SingletonNew;

public class ReflectionTest {

	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("com.dp3.SingletonNew");
			
			Constructor[] con = clazz.getDeclaredConstructors();
			
			con[0].setAccessible(true);
			
			SingletonNew s = (SingletonNew) con[0].newInstance();
			
			SingletonNew s1 = (SingletonNew) con[0].newInstance();
			
			SingletonNew s2 = SingletonNew.getInstance();
			
			System.out.println(s.hashCode()+ " " + s1.hashCode() + " " + s2.hashCode());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
