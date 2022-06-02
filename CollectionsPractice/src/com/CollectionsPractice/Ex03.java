package com.CollectionsPractice;
import java.util.*;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Red");
		l.add("Green");
		l.add("Orange");
		l.add("White");
		l.add("Black");
		
		System.out.println(l);
		
		l.add(0, "Brown");
		System.out.println(l);
	}
	

}
