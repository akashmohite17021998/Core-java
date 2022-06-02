package com.factorymethod.factory;

import com.factorymethod.bike.BajajBike;

public abstract class BajajBikeFactory {

	public abstract void assemble();
	public abstract void paint();
	public abstract void engineTest();
	public abstract void roadTest();
	public abstract BajajBike creatBike(String type);
	
	public BajajBike orderBike(String type) {
		BajajBike bike = creatBike(type);
		paint();
		assemble();
		engineTest();
		roadTest();
		return bike;
		
	}
	
}
