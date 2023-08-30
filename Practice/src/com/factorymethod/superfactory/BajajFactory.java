package com.factorymethod.superfactory;

import com.factorymethod.bike.BajajBike;

public abstract class BajajFactory {
	
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
