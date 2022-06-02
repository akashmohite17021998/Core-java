package com.nt.director;

import com.nt.builder.HouseBuilder;
import com.nt.product.House;

public class CivilEngineer {

	private HouseBuilder builder;
	
	public CivilEngineer(HouseBuilder builder) {
		System.out.println("CivilEngineer:: 1-param constructor");
		this.builder = builder;
	}
	
	public void constructHouse() {
		System.out.println("CivilEngineer.constructHouse()");
		builder.buildBasement();
		builder.buildStructure();
		builder.buildRoofing();
		builder.buildInterior();
	}
	
	public House getHouse() {
		return builder.createHouse();
	}
}
