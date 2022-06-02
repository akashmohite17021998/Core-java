package com.singleton.test;

import java.lang.reflect.Constructor;

import com.singleton.singleton.Singleton;
import com.singleton.singleton.Singleton2;
import com.singleton.singleton.Singleton3;

public class SingletonClassReflectionAPITest {

	public static void main(String[] args) {
		
//		try {
//			
//			//Load the singleton java class
//			Class c = Class.forName("com.singleton.Singleton2");
//			//(or)
//			//Class c = Singleton.class;
//			
//			//get all the declared constructors of the class.
//			Constructor cons[] = c.getDeclaredConstructors();
//			
//			//get access private constructor (if any)
//			cons[0].setAccessible(true);
//			
//			//Creates objects for singleton java class using the accessed private constructor.
//			
//			Singleton2 s1 = (Singleton2)cons[0].newInstance();
//			Singleton2 s2 = (Singleton2)cons[0].newInstance();
//			Singleton2 s = Singleton2.getINSTANCE();	//using static factory method.
//			
//			System.out.println(s.hashCode() + " " + s1.hashCode() + " " + s2.hashCode());
//			
//		}//try
//		catch(Exception e) {
//			e.printStackTrace();
//		}//catch
		
		
		
//		try {
//			
//			//Load the singleton java class
//			Class c = Class.forName("com.singleton.Singleton");
//			//(or)
//			//Class c = Singleton.class;
//			
//			//get all the declared constructors of the class.
//			Constructor cons[] = c.getDeclaredConstructors();
//			
//			//get access private constructor (if any)
//			cons[0].setAccessible(true);
//			
//			//Creates objects for singleton java class using the accessed private constructor.
//			
//			Singleton s1 = (Singleton)cons[0].newInstance();
//			Singleton s2 = (Singleton)cons[0].newInstance();
//			Singleton s = Singleton.getINSTANCE();	//using static factory method.
//			
//			System.out.println(s.hashCode() + " " + s1.hashCode() + " " + s2.hashCode());
//			
//		}//try
//		catch(Exception e) {
//			e.printStackTrace();
//		}//catch
		
		
		try {
			
			//Load the singleton java class
			Class c = Class.forName("com.singleton.singleton.Singleton");
			//(or)
			//Class c = Singleton.class;
			
			//get all the declared constructors of the class.
			Constructor cons[] = c.getDeclaredConstructors();
			
			//get access private constructor (if any)
			cons[0].setAccessible(true);
			
			//Creates objects for singleton java class using the accessed private constructor.
			
			Singleton s1 = (Singleton)cons[0].newInstance();
			Singleton s2 = (Singleton)cons[0].newInstance();
			Singleton s = Singleton.getINSTANCE();	//using static factory method.
			
			System.out.println(s.hashCode() + " " + s1.hashCode() + " " + s2.hashCode());
			
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}//catch
		
	}//main
}//class
