package com.collectios;
import java.util.TreeSet;

public class ComparableExample {
	
	public static void main(String[] args) {
		
//		TreeSet t = new TreeSet();
//		t.add("K");
//		t.add("Z");
//		t.add("A");
//		t.add("A");
//		t.add(null);
//		System.out.println(t);
		
		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("K"));
		System.out.println("A".compareTo("A"));
		System.out.println("A".compareTo(null));
		
	}

}
