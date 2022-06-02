package com.CollectionsPractice;
import java.util.*;

public class Ex08 {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Red");
		l.add("Green");
		l.add("Orange");
		l.add("White");
		l.add("Black");
		
		System.out.println("The list before sorting: " + l);
		Collections.sort(l);
		System.out.println("The list after sorting: " + l);
	}

}
