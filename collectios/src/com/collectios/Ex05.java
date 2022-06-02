package com.collectios;
import java.util.*;

public class Ex05 {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.add("Durga");
		l.add(30);
		l.add(null);
		l.add("Durga");
		
		System.out.println(l);
		
		l.set(0, "Software");
		
		System.out.println(l);
		
		l.add(0, "venkey");
		
		System.out.println(l);
		
		l.removeLast();
		
		System.out.println(l);
		
		l.addFirst("CCC");
		
		System.out.println(l);
	}

}
