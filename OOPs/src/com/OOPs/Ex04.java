package com.OOPs;

class p 
{
	public void m1()
	{
		System.out.println("Parent class");
	}

}
class c extends p
{
	public void m2()
	{
		System.out.println("Child class");
	}
}

class Ex04
{
	public static void main(String[] args) 
	{
		p p = new p();
		p.m1();
//		p.m2();
		
		c c = new c();
		c.m1();
		c.m2();
		
		p p1 = new c();
		p1.m1();
//		p1.m2();
		
//		c c1 = new p();
	}
	
	
}