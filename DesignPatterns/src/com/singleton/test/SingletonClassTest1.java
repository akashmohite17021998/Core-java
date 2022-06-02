package com.singleton.test;

import com.singleton.singleton.Singleton;
import com.singleton.singleton.Singleton2;
import com.singleton.singleton.Singleton3;

public class SingletonClassTest1 {

	public static void main(String[] args) {
		
//		//get Singleton java object
//		Singleton s1 = Singleton.getINSTANCE();
//		Singleton s2 = Singleton.getINSTANCE();
//		System.out.println("Hashcodes of s1 and s2 : " + s1.hashCode() + " " + s2.hashCode());
//		System.out.println("Referance comparision : " + (s1 == s2));
		
//		//get Singleton java object
//		Singleton2 s1 = Singleton2.getINSTANCE();
//		Singleton2 s2 = Singleton2.getINSTANCE();
//		System.out.println("Hashcodes of s1 and s2 : " + s1.hashCode() + " " + s2.hashCode());
//		System.out.println("Referance comparision : " + (s1 == s2));
		
		//get Singleton java object
		Singleton3 s1 = Singleton3.getINSTANCE();
		Singleton3 s2 = Singleton3.getINSTANCE();
		System.out.println("Hashcodes of s1 and s2 : " + s1.hashCode() + " " + s2.hashCode());
		System.out.println("Referance comparision : " + (s1 == s2));
		
	}
}
