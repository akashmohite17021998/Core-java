package com.nt.factory;

import com.nt.recruitment.HireDotNetFresher;
import com.nt.recruitment.HireFresher;
import com.nt.recruitment.HireJavaFresher;
import com.nt.recruitment.HireUIFresher;

public class HireFresherFactory {

	public static HireFresher getInstance(String type) {
		
		HireFresher fresher = null;
		
		if(type.equalsIgnoreCase("java")) {
			fresher = new HireJavaFresher();
		}
		
		else if(type.equalsIgnoreCase("dotNet")) {
			fresher = new HireDotNetFresher();
		}
		
		else if(type.equalsIgnoreCase("ui")) {
			fresher = new HireUIFresher();
		}
		
		else
			throw new IllegalArgumentException("Invalid fresher type");
		
		return fresher;
	}
}
