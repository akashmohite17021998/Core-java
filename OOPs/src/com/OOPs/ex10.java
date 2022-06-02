package com.OOPs;

public class ex10 {
	public void m1(int i, float f)
	{
		System.out.println("int-float");
	}
	public void m1(float f, int i)
	{
		System.out.println("float-int");
	}
	public static void main(String[] args)
	{
		ex10 a = new ex10();
		a.m1(10, 10.5f);
		a.m1(10.5f, 10);
		a.m1('a', 10.5f);
//		a.m1(10, 10);
//		a.m1(10.5f, 10.5f);
	}

}
