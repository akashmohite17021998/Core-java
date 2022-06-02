package com.problem.factorymethod.factory;

import com.problem.factorymethod.bike.BajajBike;
import com.problem.factorymethod.bike.BajajDiscoverBike;
import com.problem.factorymethod.bike.BajajPlatinaBike;
import com.problem.factorymethod.bike.BajajPulsorBike;
import com.problem.factorymethod.factory.method.BajajBikeFactory;

//factory pattern 1
public class NoidaBajajFactory extends BajajBikeFactory {

	public BajajBike createBike(String str) {
		BajajBike bike = null;
		if(str.equalsIgnoreCase("pulsor"))
			bike = new BajajPulsorBike();
		else if(str.equalsIgnoreCase("platina"))
			bike = new BajajPlatinaBike();
		else if(str.equalsIgnoreCase("discover"))
			bike = new BajajDiscoverBike();
		else
			throw new IllegalArgumentException("Invalid bike type");
		
		return bike;
	}

	@Override
	public void painting() {
		System.out.println("NoidaBajajFactory.painting()");
		
	}

	@Override
	public void assembling() {
		System.out.println("NoidaBajajFactory.assembling()");
		
	}

	@Override
	public void engineTest() {
		System.out.println("NoidaBajajFactory.engineTest()");
		
	}

	@Override
	public void roadTest() {
		System.out.println("NoidaBajajFactory.roadTest()");
		
	}

}
