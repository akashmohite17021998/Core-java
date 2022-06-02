package com.defaults;

import java.util.List;

public class Multiplierimpl implements Multiplier {

	@Override
	public int multiply(List<Integer> list) {
		
		System.out.println("Inside Multiplierimpl class.");
		
		return list.stream().reduce(1, (x,y) -> x*y);
	}
	
	@Override
	public int size(List<Integer> list) {
		System.out.println("Multiplierimpl class size method called.");
		return 0;
	}
}
