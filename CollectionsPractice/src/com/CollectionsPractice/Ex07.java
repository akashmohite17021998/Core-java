package com.CollectionsPractice;
import java.util.*;

public class Ex07 {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Red");
		l.add("Green");
		l.add("Orange");
		l.add("White");
		l.add("Black");
		
		if(l.contains("Orange")) {
			System.out.println("Found the element");
		}
		else {
			System.out.println("Element not found");
		}
	}

}
