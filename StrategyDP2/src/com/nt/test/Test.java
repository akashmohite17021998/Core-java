package com.nt.test;

import com.nt.comps.ECommerceStore;
import com.nt.factory.ECommerceStoreFactory;

public class Test {

	public static void main(String[] args) {
		
		ECommerceStore e = ECommerceStoreFactory.getInstance("dtdc");
		
		String s = e.shopping(new String[] {"Shirt",  "Hat"}, new double[] {400.0, 100.0});
		
		System.out.println(s);
	}
}
