package com.OOPs;

public class ex11 {
	public void m1(int x)
	{
		System.out.println("General method");
	}
	public void m1(int... x)
	{
		System.out.println("var arg method");
	}
	public static void main(String[] args)
	{
		ex11 a =new ex11();
		a.m1();
		a.m1(10, 20);
		a.m1(10);
	}

}
