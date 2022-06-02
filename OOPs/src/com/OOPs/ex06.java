 package com.OOPs;

public class ex06 {
	public void m1()
	{
		System.out.println("no-arg");
	}
	public void m1(int i)
	{
		System.out.println("int-arg");
	}
	public void m1(double d)
	{
		System.out.println("double-arg");
	}
	public static void main(String[] args)
	{
		ex06 a = new ex06();
		a.m1();
		a.m1(10);
		a.m1(10.5);
		
	}

}
