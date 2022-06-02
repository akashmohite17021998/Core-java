package com.nt.comps;

//Dependent class
public final class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart::0-param constructor");
	}
	
	@Override
	public String deliverOrder(int oid) {
		
		return oid + "Order id order products are delivered by BlueDart courior service.";
	}

	
}
