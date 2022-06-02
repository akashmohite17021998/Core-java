package com.nt.service;

import com.nt.adapter.WeatherReportCompAdapter;

public class AccuWetherServiceImpl implements AccuWeatherService {

	@Override
	public String showTempareture(String cityName) {
		
		WeatherReportCompAdapter w = new WeatherReportCompAdapter();
		
		String s = w.fetchTempareture(cityName);
		
		return s;
	}

}
