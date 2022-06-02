package com.exceptionHandling;

public class ex87 {
	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			throw new NullPointerException();
		}
	}

}
