package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public class ECommerceStore {

	private Courior courior;
	
	public ECommerceStore() {
		System.out.println("ECommerceStore.ECommerceStore()");
	}
	
	public void setCourior(Courior courior) {
		System.out.println("ECommerceStore.setCourior()");
		this.courior= courior;
	}
	
	public String shopping(String[] items, double[] prices) {
		
		double billamt = 0.0;
		for(double d:prices) {
			billamt += d;
		}
		
		String billmsg = Arrays.toString(items) + " with prices " + Arrays.toString(prices) + " with bill amount " + billamt;
		
		int oid = new Random().nextInt(1000);
		
		String deliver = courior.deliverOrder(oid);
		
		return billmsg + "\n=============\n" + deliver;
	}
}
