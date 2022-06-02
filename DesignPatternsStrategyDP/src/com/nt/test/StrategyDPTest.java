package com.nt.test;

import com.nt.comps.ECommerceStore;
import com.nt.factory.ECommerceStoreFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		//get target class object
		ECommerceStore store = ECommerceStoreFactory.getInstance("dhl");
		
		//invoke the b.method
		String resultMsg = store.shopping(new String[] {"shirt", "hat"}, new double[] {1500, 100});
		System.out.println(resultMsg);
	}
}
