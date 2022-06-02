package com.nt.external;

import java.util.Random;

public class WheatherReportIml implements WheatherReport {

	@Override
	public float getTemperature(int cityCode) {
		
		if(cityCode==1100)
			return new Random().nextFloat()*100.0f;
		
		else if(cityCode==1101)
			return new Random().nextFloat()*100.0f;
		
		else if(cityCode==1102)
			return new Random().nextFloat()*100.0f;
		
		else
			throw new IllegalArgumentException("Invalid city code.");
	}

	
}
