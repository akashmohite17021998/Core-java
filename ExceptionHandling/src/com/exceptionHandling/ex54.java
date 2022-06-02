package com.exceptionHandling;

public class ex54 {
	public static void main(String[] args) throws InterruptedException
	{
		doStuff();
	}
	public static void doStuff() throws InterruptedException
	{
		doMoreStuff();
	}
	public static void doMoreStuff() throws InterruptedException
	{
		Thread.sleep(10000);
	}

}
