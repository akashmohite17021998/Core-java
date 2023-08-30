package com.strategdp.test;

import com.strategdp.comps.Flipkart;
import com.strategydp.factory.CouriorFactory;

public class FlipkartTest {

	public static void main(String[] args) {
		
		Flipkart f = CouriorFactory.getCourior("dtdc");
		
		String s = f.shopping(new String[] {"shirts, pents, caps"}, new double[] {500.0, 600.0, 100.0});
		
		System.out.println(s);
		
	}
}
