package com.strategydp.factory;

import com.strategdp.comps.BlueDart;
import com.strategdp.comps.Courior;
import com.strategdp.comps.DTDC;
import com.strategdp.comps.Flipkart;

public class CouriorFactory {

	public static Flipkart getCourior(String name) {
		
		Courior courior = null;
		
		if(name.equalsIgnoreCase("bdart")) {
			courior = new BlueDart();
		}else if(name.equalsIgnoreCase("dtdc")) {
			courior = new DTDC();
		}else {
			throw new IllegalArgumentException("invalid argument type");
		}
		
		Flipkart f = new Flipkart();
		f.setCourior(courior);
		
		return f;
	}
}
