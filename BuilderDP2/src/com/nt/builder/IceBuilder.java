package com.nt.builder;

import com.nt.product.House;
import com.nt.product.IceBasement;
import com.nt.product.IceCurvingInterior;
import com.nt.product.IceRoofing;
import com.nt.product.IceStructure;

public class IceBuilder implements HouseBuilder {

	House house;
	
	public IceBuilder() {
		System.out.println("IceBuilder.0-param constructor");
		house = new House();
	}
	
	
	@Override
	public void buildBasement() {
		System.out.println("IceBuilder.buildBasement()");
		house.setBasement(new IceBasement());

	}

	@Override
	public void buildStructure() {
		System.out.println("IceBuilder.buildStructure()");
		house.setStructure(new IceStructure());


	}

	@Override
	public void buildRoofing() {
		System.out.println("IceBuilder.buildRoofing()");
		house.setRoofing(new IceRoofing());

	}

	@Override
	public void buildInterior() {
		System.out.println("IceBuilder.buildInterior()");
		house.setInterior(new IceCurvingInterior());

	}

	@Override
	public House createHouse() {
		System.out.println("IceBuilder.createHouse()");
		return house;

	}

}
