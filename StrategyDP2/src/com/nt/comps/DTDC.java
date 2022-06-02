package com.nt.comps;

public final class DTDC implements Courior {

	public DTDC() {
		System.out.println("DTDC.0-param constructor");
	}
	
	@Override
	public String deliverOrder(int oid) {

		return oid + " order id is deliverd";
	}

}
