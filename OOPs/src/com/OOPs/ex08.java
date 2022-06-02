package com.OOPs;

public class ex08 {
	public void m1(String s)
	{
		System.out.println("String");
	}
	public void m1(Object o)
	{
		System.out.println("Object");
	}
	public static void main(String[] args)
	{
		ex08 a = new ex08();
		a.m1(new Object());
		a.m1("a");
		a.m1(null);
	}

}
