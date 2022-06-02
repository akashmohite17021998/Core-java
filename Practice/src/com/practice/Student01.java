package com.practice;

public class Student01 {
	
	int rollno;
	String name;
	String city;
	
	public Student01(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}
	
	public static void main(String[] args) {
		Student01 s1 = new Student01(101, "durga", "pune");
		Student01 s2 = new Student01(102, "nagarjuna", "haydrabad");
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
