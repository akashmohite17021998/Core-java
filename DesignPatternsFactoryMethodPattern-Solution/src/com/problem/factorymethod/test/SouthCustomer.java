package com.problem.factorymethod.test;

import com.problem.factorymethod.bike.BajajBike;
import com.problem.factorymethod.factory.CheenaiBajajFactory;
import com.problem.factorymethod.factory.NoidaBajajFactory;
import com.problem.factorymethod.factory.method.BajajBikeFactory;

public class SouthCustomer {

	public static void main(String[] args) {
		BajajBikeFactory factory = new CheenaiBajajFactory();
		BajajBike bike = factory.orderBike("pulsor");
		bike.drive();
		
	}
}
