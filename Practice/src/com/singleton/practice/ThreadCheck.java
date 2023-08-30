package com.singleton.practice;

public class ThreadCheck implements Runnable {

	@Override
	public void run() {
		System.out.println("ThreadCheck.run()");
		SingltonClassThreading single = SingltonClassThreading.getInstance();
		
		System.out.println(single.hashCode());

	}

}
