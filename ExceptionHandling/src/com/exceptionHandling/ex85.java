package com.exceptionHandling;
import java.io.*;
public class ex85 {
	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/0);
			String s = null;
			System.out.println(s.length());
		}
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println(e);
		}
	}

}
