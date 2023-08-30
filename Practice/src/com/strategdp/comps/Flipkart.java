package com.strategdp.comps;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	private Courior courior;

	public void setCourior(Courior courior) {
		this.courior = courior;
	}
	
	public String shopping(String[] items, double[] price) {
		
		double finalp = 0;
		
		for(double d:price) {
			finalp += d;
		}
		
		String deliver = courior.deliver(new Random().nextInt(1000));
		
		return Arrays.toString(items) + " items with prices " + Arrays.toString(price) + " with bill amount " + finalp + "=======" + deliver;
	}
}
