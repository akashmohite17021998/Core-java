package com.overrideannotation;

public class OverrideAnnotation {

	public static void main(String[] args) {
		Animal a = new Dog();
		a.eatSomthing();
	}
}

class Animal{
	public void eatSomthing() {
		System.out.println("Animal eating somthing");
	}
}

class Dog extends Animal{
	
	@Override
	public void eatSomthing() {
		System.out.println("Dog eating somthing");
	}
}