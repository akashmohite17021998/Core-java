package com.nt.builder;

import com.nt.products.House;

public interface Builder {

	public void buildBasement();
	public void buildStructure();
	public void buildRoofing();
	public void buildinterior();
	
	public House createhouse();
}
