package com.nt.comps;

public final class DHL implements Courior {

	public DHL() {
		System.out.println("DHL.0-param constructor");
	}
	
	@Override
	public String deliverOrder(int oid) {
		
		return oid + " order id is deliverd";
	}

}
