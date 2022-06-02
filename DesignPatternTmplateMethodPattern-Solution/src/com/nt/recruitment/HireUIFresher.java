package com.nt.recruitment;

public class HireUIFresher extends HireFresher {

	@Override
	public boolean conductTechnicalWrittenTest() {
		System.out.println("HireUIFresher.conductTechnicalWrittenTest()");
		return false;
	}

	@Override
	public boolean conductTechnicalInterviewTest() {
		System.out.println("HireUIFresher.conductTechnicalInterviewTest()");
		return false;
	}
	
	

}
