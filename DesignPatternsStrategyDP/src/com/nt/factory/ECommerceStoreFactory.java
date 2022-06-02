package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DHL;
import com.nt.comps.ECommerceStore;

public class ECommerceStoreFactory {

	public static ECommerceStore getInstance(String courierType) {
		
		//create dependent class object
		Courier courier = null;
		
		if(courierType.equalsIgnoreCase("dhl")) 
			courier = new DHL();
		
		else if(courierType.equalsIgnoreCase("blueDart"))
			courier = new BlueDart();
		else
			throw new IllegalArgumentException("Invalid courier type");
		
		//create target class object
		ECommerceStore store = new ECommerceStore();
		store.setCourier(courier);
		return store;
	}
}
