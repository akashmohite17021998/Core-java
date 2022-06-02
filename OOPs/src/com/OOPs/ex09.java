package com.OOPs;

public class ex09 {
	public void m1(String s)
	{
		System.out.println("String");
	}
	public void m1(StringBuffer sb)
	{
		System.out.println("StringBuffer");
	}
	public static void main(String[] args)
	{
		ex09 a = new ex09();
		a.m1("Durga");
		a.m1(new StringBuffer("Durga"));
//		a.m1(null);
	}

}
