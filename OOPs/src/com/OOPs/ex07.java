package com.OOPs;

public class ex07 {
	public void m1(int i)
	{
		System.out.println("int-arg");
	}
	public void m1(float f)
	{
		System.out.println("float-arg");
	}
	public static void main(String[] args)
	{
		ex07 a = new ex07();
		a.m1(10);
		a.m1(10.5f);
		a.m1('a');
		a.m1(10l);
//		a.m1(10.5);
	}

}
