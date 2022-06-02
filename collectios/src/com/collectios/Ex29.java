package com.collectios;
import java.util.*;

public class Ex29 {
	public static void main(String[] args) {
		TreeMap m = new TreeMap(new MyComparator());
		m.put("XXX", 10);
		m.put("AAA", 20);
		m.put("ZZZ", 30);
		m.put("LLL", 40);
		
		System.out.println(m);
	}

}

class MyComparator10 implements Comparator{
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}