package com.exceptionHandling;

public class ex83 {
	public static void main(String[] args)
	{
		try
		{
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
//		catch(IOException e)
//		{
//			e.printStckTrace();
//		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
//		catch(InterruptedException e)
//		{
//			System.out.println(e.getMessage());
//		}
	}

}
