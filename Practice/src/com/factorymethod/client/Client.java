package com.factorymethod.client;

import com.factorymethod.bike.BajajBike;
import com.factorymethod.factory.BajajBikeFactory;
import com.factorymethod.factory.PuneFactory;

public class Client {

	public static void main(String[] args) {
		
		BajajBikeFactory bike = new PuneFactory();
		
		BajajBike b = bike.orderBike("pulser");
		
		b.drive();
		
	}
	
}
