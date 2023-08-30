package com.adapter.factory;

import com.adapter.external.WheatherReportCompImpl;

public class AccuWheatherFactory {

	public static String fetchTemp(String name) {
		
		int cityCode = 0;
		
		if(name.equalsIgnoreCase("mumbai")) {
			
			cityCode = 100;
			
		}else if(name.equalsIgnoreCase("pune")) {
			cityCode = 200;
		}else if(name.equalsIgnoreCase("satara")) {
			cityCode = 300;
		}else {
			return "no city found";
		}
		
		WheatherReportCompImpl w = new WheatherReportCompImpl();
		double d = w.getTemp(cityCode);
		
		return d + " degree celcius";
	}
}
