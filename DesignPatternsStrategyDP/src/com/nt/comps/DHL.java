package com.nt.comps;

//Dependent class
public final class DHL implements Courier {

	public DHL() {
		System.out.println("DHL::0-param constructor");
	}
	
	@Override
	public String deliverOrder(int oid) {
		
		return oid + "Order id order products are delivered by DHL courior service.";
	}
}
