package com.singleton.test;

import com.singleton.singleton.Singleton;
import com.singleton.singleton.Singleton2;
import com.singleton.singleton.Singleton3;

public class SingletonClassCloningTest2 {

	public static void main(String[] args) {
		
//		//get Singleton java object
//		Singleton2 s1 = Singleton2.getINSTANCE();
//		
//		try {
//		Singleton2 s2 = (Singleton2)s1.clone();
//		System.out.println(s1.hashCode() + " " + s2.hashCode());
//		System.out.println(("s1==s2?") + (s1==s2));
//		}
//		catch(CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
		
		
		
		
		
		
		
		//get Singleton java object
				Singleton s1 = Singleton.getINSTANCE();
				
				try {
				Singleton s2 = (Singleton)s1.clone();
				System.out.println(s1.hashCode() + " " + s2.hashCode());
				System.out.println(("s1==s2?") + (s1==s2));
				}
				catch(CloneNotSupportedException e) {
					e.printStackTrace();
				}
		
		
		
		
		
		//get Singleton java object
//		Singleton3 s1 = Singleton3.getINSTANCE();
//		
//		try {
//		Singleton3 s2 = (Singleton3)s1.clone();		//cloning is not possible on the constants of enum
//		System.out.println(s1.hashCode() + " " + s2.hashCode());
//		System.out.println(("s1==s2?") + (s1==s2));
//		}
//		catch(CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
//		
		
	}
}
