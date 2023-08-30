package com.OOPs;

import java.util.Enumeration;
import java.util.Vector;

public class B {
	
	public static void main(String[] args) {
		Vector<String>vector=new Vector<String>();
		vector.add("P");
		vector.add("Q");
		vector.add("R");
		vector.add("S");
		Enumeration en=vector.elements();
		while(en.hasMoreElements()) {
			
			String s = (String) en.nextElement();
		System.out.println(s);
		}
	}
}

