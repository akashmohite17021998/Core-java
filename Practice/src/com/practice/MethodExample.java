package com.practice;

import java.util.ArrayList;
import java.util.List;

public class MethodExample {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(20);
		System.out.println(list.removeAll(list));
	}
	
}
