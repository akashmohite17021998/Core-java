package com.nt.recruitment;

public abstract class HireFresher {

	public boolean conductAptitudeTest() {
		System.out.println("HireFresher.conductAptitudeTest()");
		return true;
	}
	
	public boolean conductGDTest() {
		System.out.println("HireFresher.conductGDTest()");
		return true;
	}
	
	public abstract boolean conductTechnicalWrittenTest();
	
	public abstract boolean conductTechnicalInterviewTest();
	
	public boolean conductHRTest() {
		System.out.println("HireFresher.conductHRTest()");
		return true;
	}
	
	public boolean fresherRecruitmentDrive() {
		boolean flag = conductAptitudeTest();
		
		if(flag)
			flag = conductGDTest();
		
		if(flag)
			flag = conductTechnicalWrittenTest();
		
		if(flag)
			flag = conductTechnicalInterviewTest();
		
		if(flag)
			flag = conductHRTest();
		
		return flag;
		
	}
}
