package com.exceptionHandling;

public class ex03 {
	public static void main(String[] args)
	{
		doStuff();
	}
	public static void doStuff() 
	{
		doMoreStuff();
	}
	public static void doMoreStuff()
	{
		System.out.println(10/0);
	}

}
