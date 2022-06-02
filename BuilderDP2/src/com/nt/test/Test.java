package com.nt.test;

import com.nt.factory.HouseFactory;
import com.nt.product.House;

public class Test {

	public static void main(String[] args) {
		House house = HouseFactory.getInstance("concrete");
		System.out.println(house);
	}
	
}
