package com.exceptionHandling;

public class CustException {
	public static void main(String[] args)
	{
		int age = Integer.parseInt(args[0]);
		if(age > 60)
		{
			throw new TooOldException("Plz wait some more time you will get best match soon");
		}
		else if(age < 18)
		{
			throw new TooYoungException("Yor age is already crossed marriage age no chance of getting marriage");
		}
		else
		{
			System.out.println("You will get best match soon");
		}
	}

}
