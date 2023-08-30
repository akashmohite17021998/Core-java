package com.nt.comps;

import java.util.Arrays;
import java.util.Random;
		//implementing rule number 3 (code must be open for extension and must be closed for modification)
public final class ECommerceStore {

	//HAS-A property	implementing rule number 2 code in interface and abstract classes never code in implementation or concrete classes
	private Courier courier;
	
	public ECommerceStore() {
		System.out.println("ECommerceStore.0-param constrctor");
	}
	
	//setter method to assign the dynamically chosen dependent class object to target class object
	public void setCourier(Courier courier) {
		this.courier = courier;
		System.out.println("ECommerceStore.setCourier(-)");
	}
	
	//b.method in target class
	public String shopping(String[] items, double[] prices) {
		
		//calc bill amount
		double billAmt = 0.0;
		
		for(double price:prices)
			billAmt+= price;
		
		String billMsg = Arrays.toString(items) + "with prices" + Arrays.toString(prices) + "Bill Amount:: " + billAmt;
		
		//Deliver products generate order id
		int oid = new Random().nextInt(1000);
		
		//deliver products
		String deliverMsg = courier.deliverOrder(oid);
		return billMsg + "\n========" + deliverMsg;
	}
}
