package com.nt.service;

import com.nt.adapter.WeatherAdapter;

public class WheatherServiceIml implements WheatherService {

	@Override
	public String showTemperature(String cityName) {
		
		WeatherAdapter adapter = new WeatherAdapter();
		
		String s = adapter.fetchTemperature(cityName);
		
		return s;
	}

}
