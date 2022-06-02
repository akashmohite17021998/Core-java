package com.factorymethod.client;

import javax.xml.transform.Templates;

import com.factorymethod.bike.BajajBike;
import com.factorymethod.factory.BajajBikeFactory;
import com.factorymethod.factory.ChennaiFactory;

public class Client2 {

	Templates t;
	
	public static void main(String[] args) {
		
		BajajBikeFactory bike = new ChennaiFactory();
		BajajBike b = bike.orderBike("pulser");
		b.drive();
		
		
		
	}
	
}
