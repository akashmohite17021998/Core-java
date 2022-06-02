package com.CollectionsPractice;
import java.util.*;

public class Ex11 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Red");
		l.add("Green");
		l.add("Orange");
		l.add("White");
		l.add("Black");
		System.out.println("List before reverse: \n" + l);
		Collections.reverse(l);
		System.out.println("List after reverse: \n" + l);
	}

}
