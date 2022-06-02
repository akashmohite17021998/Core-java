package com.nt.test;

import com.nt.recruitment.HireDotNetFresher;



public class Recruiter2 {

	public static void main(String[] args) {
		
	
	boolean flag = true;
	
	HireDotNetFresher dotNetFresher = new HireDotNetFresher();
	
	if(!dotNetFresher.conductAptitudeTest())
		flag = false;
		if(!dotNetFresher.conductGDTest())
			flag = false;
			if(!dotNetFresher.conductDotNetTechnicalTest())
				flag = false;
				if(!dotNetFresher.conductDotNetTechnicalTest())
					flag = false;
					if(!dotNetFresher.conductHRTest())
						flag = false;
					if(flag)
						System.out.println("dotNet fresher recruited.");
					else
						System.out.println("dotNet fresher not recruited");
}
}