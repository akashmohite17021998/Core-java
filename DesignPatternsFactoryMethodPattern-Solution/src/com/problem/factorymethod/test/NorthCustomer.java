package com.problem.factorymethod.test;

import com.problem.factorymethod.bike.BajajBike;
import com.problem.factorymethod.factory.NoidaBajajFactory;
import com.problem.factorymethod.factory.method.BajajBikeFactory;

public class NorthCustomer {

	public static void main(String[] args) {
		
		BajajBikeFactory factory = new NoidaBajajFactory();
		BajajBike bike = factory.orderBike("pulsor");
		bike.drive();
	}
}
