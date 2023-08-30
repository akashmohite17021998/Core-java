package com.factorymethod.factory;

import com.factorymethod.bike.BajajBike;
import com.factorymethod.bike.Discover;
import com.factorymethod.bike.Platina;
import com.factorymethod.bike.Pulser;
import com.factorymethod.superfactory.BajajFactory;

public class ChennaiFactory extends BajajFactory {

	public void painting() {
		System.out.println("ChannaiFactory.painting()");
	}

	public void assembling() {
		System.out.println("ChannaiFactory.assembling()");
	}

	public void engineTest() {
		System.out.println("ChannaiFactory.engineTest()");
		
	}

	public void roadTest() {
		System.out.println("ChannaiFactory.roadTest()");
	}

	public BajajBike createBike(String type) {
		BajajBike bike = null;
		
		if(type.equalsIgnoreCase("pulser")) {
			bike = new Pulser();
		}else if(type.equalsIgnoreCase("discover")) {
			bike = new Discover();
		}else if(type.equalsIgnoreCase("platina")) {
			bike = new Platina();
		}
		
		return bike;
	}

}
