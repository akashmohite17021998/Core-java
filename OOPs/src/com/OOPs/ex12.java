package com.OOPs;

class animal {

}
class monkey extends animal
{
	
}
class demo
{
	public void m1(animal a)
	{
		System.out.println("animal version");
	}
	public void m1(monkey a)
	{
		System.out.println("monkey version");
	}
	public static void main(String[] args)
	{
		demo t = new demo();
		
		animal a = new animal();
		t.m1(a);
		
		monkey m = new monkey();
		t.m1(m);
		
		animal a1 = new monkey();
		t.m1(a1);
		
		
	}
}
