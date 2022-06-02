package com.problem.factorymethod.test;

import com.problem.factorymethod.bike.BajajBike;
import com.problem.factorymethod.factory.NoidaBajajFactory;

public class NorthCustomer {

	public static void main(String[] args) {
		
		BajajBike bike = NoidaBajajFactory.createBike("pulsor");
		bike.drive();
	}
}
