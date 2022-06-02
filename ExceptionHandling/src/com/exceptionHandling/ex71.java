package com.exceptionHandling;

public class ex71 {
	public static void m1()
	{
		m2();
	}
	public static void m2()
	{
		m1();
	}
	public static void main(String[] args)
	{
		m1();
	}

}
