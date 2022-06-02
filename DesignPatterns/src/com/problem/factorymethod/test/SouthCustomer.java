package com.problem.factorymethod.test;

import com.problem.factorymethod.bike.BajajBike;
import com.problem.factorymethod.factory.CheenaiBajajFactory;

public class SouthCustomer {

	public static void main(String[] args) {
		BajajBike bike = CheenaiBajajFactory.createBike("pulsor");
		bike.drive();
		
	}
}
