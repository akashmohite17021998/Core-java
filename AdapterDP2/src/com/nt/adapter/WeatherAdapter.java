package com.nt.adapter;

import com.nt.external.WheatherReport;
import com.nt.external.WheatherReportIml;

public class WeatherAdapter {

	public String fetchTemperature(String cityName) {
		
		int cityCode = 0;
		
		if(cityName.equalsIgnoreCase("hydrabad"))
			cityCode = 1100;
		
		else if(cityName.equalsIgnoreCase("delhi"))
			cityCode = 1101;
		
		else if(cityName.equalsIgnoreCase("banglore"))
			cityCode = 1102;
		
		else
			return "city not found.";
		
		WheatherReport w = new WheatherReportIml();
		
		float f = w.getTemperature(cityCode);
		
		float c = 5/9.0f*(f-32.0f);
		
		return c + "degree celcius";
	}
}
