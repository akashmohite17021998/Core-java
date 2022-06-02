package com.defaults;

import java.util.List;

public interface Multiplier {

	int multiply(List<Integer> list);
	
	default int size(List<Integer> list) {
		return list.size();
	}
	
	static boolean empty(List<Integer> list) {
		
		System.out.println("Multiplier interface size method called.");
		return list!=null && list.size() > 0;
	}
}
