package com.collectios;
import java.util.*;

public class Ex19 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator2());
		t.add("Roja");
		t.add("ShobhaRani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("Ramulamma");
		System.out.println(t);
	}

}

class MyComparator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = (String)o2;
		return s2.compareTo(s1);
	}
	
}
