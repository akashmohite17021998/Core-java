package com.test2;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import com.dp2.SingletonWithDoubleNullCheck;

public class ClassLoaderTest {

	public static void main(String[] args) {
		
		SingletonWithDoubleNullCheck s = SingletonWithDoubleNullCheck.getInstance();
		
		try {
			
			URLClassLoader loader = new URLClassLoader(new URL[] {new URL("file:/D:/Proj3.jar")}, null);
			
			Class clazz = loader.loadClass("com.dp2.SingletonWithDoubleNullCheck");
			
			Method method = clazz.getDeclaredMethod("getInstance", new Class[] {});
			
			Object s1 = method.invoke(null);
			
			System.out.println(s.hashCode() + " " + s1.hashCode());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
}
