package com.test2;

import com.dp2.SingletonWithDoubleNullCheck;

public class CloneableTest {

	public static void main(String[] args) {
		
		SingletonWithDoubleNullCheck s = SingletonWithDoubleNullCheck.getInstance();
		
		try {
			SingletonWithDoubleNullCheck s1 = (SingletonWithDoubleNullCheck)s.clone();
			System.out.println(s.hashCode() + " " + s1.hashCode());
			System.out.println(s==s1);
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
