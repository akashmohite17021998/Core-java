package com.singleton.test;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import com.singleton.singleton.Singleton;

public class SingletonClassTestUsingClassLoader {

	
	public static void main(String[] args) {
		
		//Problem code
		/*try {
			//Object creation using application class loader
			System.out.println("====Using Application class loader====");
			
			Singleton s = Singleton.getINSTANCE();
			
			System.out.println("-------------------------\n");
			
			//Object creation using custom class loader
			System.out.println("====Using Custom Class loader(readymade custome classloader)=====");
			
			//Create the custom class loader using URLClassLoader
			URLClassLoader loader = new URLClassLoader(new URL[] {new URL("file:/D:/Proj1.jar")}, null);
			
			//Load the specific class
			Class<?> clazz = loader.loadClass("com.singleton.Singleton");
			
			//Get access to getINSTANCE() method of the loaded class
			Method method = clazz.getDeclaredMethod("getINSTANCE", new Class[] {});
			
			//invoke the method
			Object obj = method.invoke(null); //null for no argument to pass
			
			System.out.println("Object hashCodes : " + obj.hashCode() + " " + s.hashCode());
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		
		
		//Solution code
		/*try {
			//Object creation using application class loader
			System.out.println("====Using Application classloader====");
			Singleton s1 = Singleton.getINSTANCE();
			System.out.println("Class loader" + s1.getClass().getClassLoader());
			System.out.println("---------------------------\n");
			
			//Object creation using Custom classloader
			URLClassLoader loader = new URLClassLoader(new URL[] {new URL("file:/D:/Proj1.jar")}, s1.getClass().getClassLoader());
			
			//create the class loader using URLClassLoader
			Class<?> clazz = loader.loadClass("com.singleton.Singleton");
			
			//get access to getINSTANCE() method of the loaded class
			Method method = clazz.getDeclaredMethod("getINSTANCE", new Class[] {});
			
			//invoke the method
			Object obj = method.invoke(null);
			System.out.println("Object has hash code : " + obj.hashCode() + " " + s1.hashCode());
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			//Object creation using Application class loader
			Singleton s = Singleton.getINSTANCE();
			System.out.println("-------------------------------------\n");
			
			//Object creation using URLClassLoader or customize class loader
			URLClassLoader loader = new URLClassLoader(new URL[] {new URL("file:/D:/Proj1.jar")}, s.getClass().getClassLoader());
			
			//Class loading
			Class<?> clazz = loader.loadClass("com.singleton.Singleton");
			
			//get access of the factory method
			Method method = clazz.getDeclaredMethod("getINSTANCE", new Class[] {});
			
			//invoke the method
			Object obj = method.invoke(null);	//null for no argument to pass
			
			System.out.println("Object hashCode : " + obj.hashCode() + " " + s.hashCode());
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
