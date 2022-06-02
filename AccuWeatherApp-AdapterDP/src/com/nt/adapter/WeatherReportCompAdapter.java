package com.nt.adapter;

import com.nt.external.IWeatherReportComp;
import com.nt.external.WeatherReportCompImpl;

public class WeatherReportCompAdapter {

	public String fetchTempareture(String cityName) {
		
		int cityCode = 0;
		if(cityName.equalsIgnoreCase("hydrabad"))
			cityCode = 1100;
		
		else if(cityName.equalsIgnoreCase("delhi"))
			cityCode = 1101;
		
		else if(cityName.equalsIgnoreCase("banglore"))
			cityCode = 1102;
		
		else
			return "City not found.";
		
		IWeatherReportComp i = new WeatherReportCompImpl();
		
		float f = i.getTempareture(cityCode);
		
		float c = 5/9.0f*(f-32.0f);
		
		return c + " degree celcius";
	}
}
