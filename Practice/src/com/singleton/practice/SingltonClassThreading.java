package com.singleton.practice;

public class SingltonClassThreading {
	
	private static SingltonClassThreading INSTANCE = null;

	private SingltonClassThreading() {
		System.out.println("SingltonClassThreading.SingltonClassThreading()");
	}
	
	public static SingltonClassThreading getInstance() {
		if(INSTANCE==null) {
			INSTANCE = new SingltonClassThreading();
		}
		return INSTANCE;
	}
}
