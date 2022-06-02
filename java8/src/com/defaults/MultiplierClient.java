package com.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(1, 3, 5);
		
		Multiplier m = new Multiplierimpl();
		
		System.out.println("Multiply of list is : " + m.multiply(l));
		
		System.out.println(m.size(l));
		
		System.out.println(Multiplier.empty(l));
	}
}
