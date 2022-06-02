package com.OOPs;

class Ex03 {
	int x = 10;

	public void tarFile() {
		System.out.println();

	}

}

class B extends Ex03 {
	private int y = 30;

	public static void main(String[] args) {
		B b = new B();

		System.out.println(b.y + b.getX());

	}

	public int getX() {
		return super.x;
	}

}
