package com.problem.factorymethod.factory;

import com.problem.factorymethod.bike.BajajBike;
import com.problem.factorymethod.bike.BajajDiscoverBike;
import com.problem.factorymethod.bike.BajajPlatinaBike;
import com.problem.factorymethod.bike.BajajPulsorBike;

public class CheenaiBajajFactory {

	public static BajajBike createBike(String str) {
		BajajBike bike = null;
		if(str.equalsIgnoreCase("pulsor"))
			bike = new BajajPulsorBike();
		else if(str.equalsIgnoreCase("platina"))
			bike = new BajajPlatinaBike();
		else if(str.equalsIgnoreCase("discover"))
			bike = new BajajDiscoverBike();
		else
			throw new IllegalArgumentException("Invalid bike type");
		
		bike.painting();
		bike.assembling();
		bike.engineTest();
		bike.roadTest();
		
		return bike;
	}
}
