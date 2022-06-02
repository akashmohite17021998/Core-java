package com.factorymethod.factory;

import com.factorymethod.bike.BajajBike;
import com.factorymethod.bike.DiscoverBike;
import com.factorymethod.bike.PlatinaBike;
import com.factorymethod.bike.PulserBike;

public class ChennaiFactory extends BajajBikeFactory {

	@Override
	public void assemble() {
		System.out.println("ChennaiFactory.assemble()");
		
	}

	@Override
	public void paint() {
		System.out.println("ChennaiFactory.paint()");
		
	}

	@Override
	public void engineTest() {
		System.out.println("ChennaiFactory.engineTest()");
		
	}

	@Override
	public void roadTest() {
		System.out.println("ChennaiFactory.roadTest()");
		
	}

	@Override
	public BajajBike creatBike(String type) {
		BajajBike bike = null;
		if(type.equalsIgnoreCase("pulser"))
			bike = new PulserBike();
		else if(type.equalsIgnoreCase("platina"))
			bike = new PlatinaBike();
		else if(type.equalsIgnoreCase("discover"))
			bike = new DiscoverBike();
		else
			throw new IllegalArgumentException("Invalid bike type");
		return bike;
	}

}
