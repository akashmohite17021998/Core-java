package com.pracice2;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethodCheck {

	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		list.forEach(System.out::println);
		
	}
}
