package com.test2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.dp2.SingletonWithDoubleNullCheck;

public class ReflectionTest {

	public static void main(String[] args) {
		
		SingletonWithDoubleNullCheck s = SingletonWithDoubleNullCheck.getInstance();
		
		try {
			
			Class c = Class.forName("com.dp2.SingletonWithDoubleNullCheck");
			
			Constructor[] con = c.getDeclaredConstructors();
			
			con[0].setAccessible(true);
			
			SingletonWithDoubleNullCheck s1 = (SingletonWithDoubleNullCheck)con[0].newInstance();
			
			System.out.println(s.hashCode() + " " + s1.hashCode());
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
