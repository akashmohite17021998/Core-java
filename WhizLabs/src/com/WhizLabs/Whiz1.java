package com.WhizLabs;

public class Whiz1 {
	public static void main(String[] args) {
		Ab bc = new Ab();
		bc.meth1(5);
	}

}

class Ab extends Whiz1{
	 void meth1(int i) {
		System.out.println("int version");
	}
	
	 void meth1(double d) {
		System.out.println("double version");
	}
	 
	 void meth1(char c) {
			System.out.println("char");
	}
	
}

class Whiz2{
	
	
	protected void meth1() {
		System.out.println("base version");
	}
	
}