package com.nt.external;

import java.util.Random;

public class WeatherReportCompImpl implements IWeatherReportComp {

	@Override
	public float getTempareture(int cityCode) {
		if(cityCode==1100)
			return new Random().nextFloat()*100.f;
		
		else if(cityCode==1101)
			return new Random().nextFloat()*100.f;
		
		else if(cityCode==1100)
			return new Random().nextFloat()*100.f;
		
		else
			throw new IllegalArgumentException("Invalid citycode.");
	}
	
}
