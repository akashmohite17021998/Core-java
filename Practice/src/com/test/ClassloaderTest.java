package com.test;



import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import com.dp.Singleton;

public class ClassloaderTest {

	public static void main(String[] args) {
		
//		try {
//			Singleton s = Singleton.getInstance();
//			
//			URLClassLoader loader = new URLClassLoader(new URL[] {new URL("fle:/D:/proj1.jar")}, null);
//			
//			Class<?> clazz = loader.loadClass("com.dp.Singleton");
//			
//			Method method = clazz.getDeclaredMethod("getInstance", new Class[] {});
//			
//			Object obj = method.invoke(null);
//			
//			System.out.println(s.hashCode() + "=====" + obj.hashCode());
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			URLClassLoader loader = new URLClassLoader(new URL[] {new URL("file:/D:/Proj2.jar")}, null);
			
			Class<?> clazz = loader.loadClass("com.dp.Singleton");
			
			Method method = clazz.getDeclaredMethod("getInstance", new Class[] {});
			
			Singleton s = (Singleton)method.invoke(null);
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
