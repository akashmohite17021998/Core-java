package com.collectios;
import java.util.*;

public class Ex21 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator4());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
	}

}
class MyComparator4 implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		String s1 = o1.toString();
		String s2 = o2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		
		if(l1<l2)
			return -1;
		else if(l1>l2)
			return +1;
		else
			return s1.compareTo(s2);
	}
}