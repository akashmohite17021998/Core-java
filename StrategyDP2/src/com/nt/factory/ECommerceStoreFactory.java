package com.nt.factory;

import com.nt.comps.Courior;
import com.nt.comps.DHL;
import com.nt.comps.DTDC;
import com.nt.comps.ECommerceStore;

public class ECommerceStoreFactory {

	public static ECommerceStore getInstance(String service) {
		
		Courior curior;
		
		if(service.equalsIgnoreCase("dhl")) {
			curior = new DHL();
		}
		
		else if(service.equalsIgnoreCase("dtdc")) {
			curior = new DTDC();
		}
		
		else {
			throw new IllegalArgumentException("Invalid courior type.");
		}
		
		ECommerceStore store = new ECommerceStore();
		
		store.setCourior(curior);
		
		return store;
		
	}
}
