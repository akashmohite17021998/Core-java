package com.problem.factorymethod.factory.method;

import com.problem.factorymethod.bike.BajajBike;

public abstract class BajajBikeFactory {

	public abstract void painting();
	public abstract void assembling();
	public abstract void engineTest();
	public abstract void roadTest();
	public abstract BajajBike createBike(String type);
	
	public BajajBike orderBike(String type) {
		BajajBike bike = createBike(type);
		painting();
		assembling();
		engineTest();
		roadTest();
		return bike;
	}
}
