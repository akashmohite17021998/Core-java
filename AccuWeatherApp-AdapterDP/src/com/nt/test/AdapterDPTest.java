package com.nt.test;

import com.nt.service.AccuWeatherService;
import com.nt.service.AccuWetherServiceImpl;

public class AdapterDPTest {

	public static void main(String[] args) {
		
		AccuWeatherService w = new AccuWetherServiceImpl();
		
		String s = w.showTempareture("hydrabad");
		
		System.out.println("The tempareture is : " + s);
	}
}
