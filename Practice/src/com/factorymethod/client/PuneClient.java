package com.factorymethod.client;

import com.factorymethod.bike.BajajBike;
import com.factorymethod.factory.PuneFactory;
import com.factorymethod.superfactory.BajajFactory;

public class PuneClient {

	public static void main(String[] args) {
		
		BajajFactory bike = new PuneFactory();
		
		BajajBike bike1 = bike.orderBike("pulser");
		
		bike1.drive();
	}
}
