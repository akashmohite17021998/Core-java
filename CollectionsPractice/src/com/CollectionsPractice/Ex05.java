package com.CollectionsPractice;
import java.util.*;

public class Ex05 {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Red");
		l.add("Green");
		l.add("Orange");
		l.add("White");
		l.add("Black");
		
		String s = l.get(0);
		System.out.println(s);
		
		String s1 = l.set(2, "Brown");
		System.out.println(l);
	}

}
