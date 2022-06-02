package com.nt.director;

import com.nt.builder.HouseBuilder;
import com.nt.product.House;

public class CivilEngineer {
	
	private HouseBuilder builder;

	public CivilEngineer(HouseBuilder builder) {
		this.builder = builder;
	}
	
	public void buildHouse() {
		builder.buildBasement();
		builder.buildStructure();
		builder.buildRoofing();
		builder.buildInterior();
	}
	
	public House getHouse() {
		return builder.createHouse();
	}
}
