package com.akash.reflection;

import java.lang.reflect.Method;

public class ReflectApp {

	public static void main(String[] args) {
		
		//no parameter
		Class noparams[] = {};
		
		//String parameter
		Class[] paramString = new Class[1];
		paramString[0] = String.class;
		
		//int parameter
		Class[] paramInt = new Class[1];
		paramInt[0] = Integer.TYPE;
		
		try {
			
			//load the AppTest at runtime
			Class cls = Class.forName("com.akash.reflection.AppTest");
			//Create object dynamically for AppTest class
			Object obj = cls.newInstance();
			
			//call the printInt method
			Method method = cls.getDeclaredMethod("printIt", noparams);
			method.invoke(obj, noparams);
			
			//call the printItString method, pass a String param
			method = cls.getDeclaredMethod("printItString", paramString);
			method.invoke(obj, new String("Akash"));
			
			//call the printItInt method, pass a int param
			method = cls.getDeclaredMethod("printItInt", paramInt);
			method.invoke(obj, 123);
			
			//call the setCounter method, pass a int param
			method = cls.getDeclaredMethod("setCounter", paramInt);
			method.invoke(obj, 999);
			
			//call the printCounter method
			method = cls.getDeclaredMethod("printCounter", noparams);
			method.invoke(obj, null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
//		Class[] noParam = {};
//		
//		try {
//		Class cls = Class.forName("com.akash.reflection.AppTest");
//		Object obj = cls.newInstance();
//		
//		Method method = cls.getDeclaredMethod("OS", noParam);
//		method.invoke(obj, null);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
	}
}