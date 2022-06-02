package com.nt.factory;

import com.nt.builder.ConcreteBuilder;
import com.nt.builder.HouseBuilder;
import com.nt.builder.IceBuilder;
import com.nt.builder.WoodenBuilder;
import com.nt.director.CivilEngineer;
import com.nt.product.House;

public class HouseFactory {

	public static House getInstance(String type) {
		
		House house;
		
		HouseBuilder builder;
		
		if(type.equalsIgnoreCase("concrete"))
			builder = new ConcreteBuilder();
		
		else if(type.equalsIgnoreCase("ice"))
			builder = new IceBuilder();
		
		else if(type.equalsIgnoreCase("wooden"))
			builder = new WoodenBuilder();
		
		else
			throw new IllegalArgumentException("Invalid house type.");
		
		CivilEngineer engineer = new CivilEngineer(builder);
		
		engineer.buildHouse();
		house = engineer.getHouse();
		
		return house;
		
	}
	
}
