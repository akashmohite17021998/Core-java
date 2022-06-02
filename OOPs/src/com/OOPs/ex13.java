package com.OOPs;

public class ex13 {
	public static void main(String[] args) {
		parent p = new parent();
		p.marry();

		son c = new son();
		c.marry();

		parent p1 = new son();
		p1.marry();
	}

}

class parent {
	public void property() {
		System.out.println("gold + land + cash");

	}

	public void marry() {
		System.out.println("Subhalaxmi");
	}
}

class son extends parent {
	public void marry() {
		System.out.println("3sha");
	}
}
