package com.nt.test;

import com.nt.service.WheatherService;
import com.nt.service.WheatherServiceIml;

public class Test {

	public static void main(String[] args) {
		
		WheatherService service = new WheatherServiceIml();
		
		String result = service.showTemperature("hydrabad");
		
		System.out.println("Temperature is : " + result);
	}
}
