package com.test3;

import com.dp3.SingletonNew;

public class MyRunnable implements Runnable {

	@Override
	public void run() {

		SingletonNew s = SingletonNew.getInstance();
		
		System.out.println(s.hashCode());
		
	}

}
