package com.adapter.external;

public class WheatherReportCompImpl implements IWheatherReportComp {

	public double getTemp(int code) {
		
		double temp = 0;
		
		if(code==100) {
			
			temp = 37;
			
		}else if(code==200) {
			temp = 30;
		}else if(code==300) {
			temp = 27;
		}
		
		return temp;
	}

}
