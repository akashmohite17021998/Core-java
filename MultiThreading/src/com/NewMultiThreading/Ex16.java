package com.NewMultiThreading;

public class Ex16 {
	public static void main(String[] args) throws InterruptedException {
		for(int i = 0; i <= 10; i++) {
			System.out.println("Slide number - " + i);
			Thread.sleep(1000);
		}
	}

}
