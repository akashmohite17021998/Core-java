package com.test3;

import com.dp3.SingletonNew;

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonNew s = SingletonNew.getInstance();
		SingletonNew s1 = (SingletonNew) s.clone();
		System.out.println(s.hashCode() + " " + s1.hashCode());
	}
}
