package com.nt.builder;

import com.nt.product.ConcreteBasement;
import com.nt.product.ConcreteInterior;
import com.nt.product.ConcreteRoofing;
import com.nt.product.ConcreteStructure;
import com.nt.product.House;

public class ConcreteBuilder implements HouseBuilder {

	House house;
	
	public ConcreteBuilder() {
		System.out.println("ConcreteBuilder.0-param constructor");
		house = new House();
	}
	
	
	@Override
	public void buildBasement() {
		System.out.println("ConcreteBuilder.buildBasement()");
		house.setBasement(new ConcreteBasement());

	}

	@Override
	public void buildStructure() {
		System.out.println("ConcreteBuilder.buildStructure()");
		house.setStructure(new ConcreteStructure());


	}

	@Override
	public void buildRoofing() {
		System.out.println("ConcreteBuilder.buildRoofing()");
		house.setRoofing(new ConcreteRoofing());

	}

	@Override
	public void buildInterior() {
		System.out.println("ConcreteBuilder.buildInterior()");
		house.setInterior(new ConcreteInterior());

	}

	@Override
	public House createHouse() {
		System.out.println("ConcreteBuilder.createHouse()");
		return house;

	}

}
