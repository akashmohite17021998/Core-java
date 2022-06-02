package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		Test1 t = new Test1(10);
		Test1 t1 = new Test1(20);
		Test1 t3 = t1.modify(30);
		System.out.println(t3);
	}
}


final class Test1{
	
	private int i;
	public Test1(int i) {
		this.i = i;
	}
	
	public Test1 modify(int i) {
		if(this.i==i) {
			return this;
		}
		else {
			return new Test1(i);
		}
	}
}