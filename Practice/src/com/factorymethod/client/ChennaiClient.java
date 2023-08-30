package com.factorymethod.client;

import com.factorymethod.bike.BajajBike;
import com.factorymethod.factory.ChennaiFactory;
import com.factorymethod.superfactory.BajajFactory;

public class ChennaiClient {

	public static void main(String[] args) {
		
		BajajFactory bike = new ChennaiFactory();
		
		BajajBike bike1 = bike.orderBike("discover");
		
		bike1.drive();
		
	}
}
