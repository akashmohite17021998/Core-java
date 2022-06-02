package com.nt.builder;

import com.nt.product.House;
import com.nt.product.WoodenBasement;
import com.nt.product.WoodenInterior;
import com.nt.product.WoodenRoofing;
import com.nt.product.WoodenStructure;

public class WoodenBuilder implements HouseBuilder {

	House house;
	
	public WoodenBuilder() {
		System.out.println("WoodenBuilder.0-param constructor");
		house = new House();
	}
	
	
	@Override
	public void buildBasement() {
		System.out.println("WoodenBuilder.buildBasement()");
		house.setBasement(new WoodenBasement());

	}

	@Override
	public void buildStructure() {
		System.out.println("WoodenBuilder.buildStructure()");
		house.setStructure(new WoodenStructure());


	}

	@Override
	public void buildRoofing() {
		System.out.println("WoodenBuilder.buildRoofing()");
		house.setRoofing(new WoodenRoofing());

	}

	@Override
	public void buildInterior() {
		System.out.println("WoodenBuilder.buildInterior()");
		house.setInterior(new WoodenInterior());

	}

	@Override
	public House createHouse() {
		System.out.println("WoodenBuilder.createHouse()");
		return house;

	}

}
