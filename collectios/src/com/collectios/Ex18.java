package com.collectios;
import java.util.*;

public class Ex18 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator1());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}

}
class MyComparator1 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Integer I1 = (Integer)o1;
		Integer I2 = (Integer)o2;
		
		//return I1.compareTo(I2);
		//return -I1.compareTo(I2);
		//return I2.compareTo(I1);
		//return I2.compareTo(I1);
		//return +1;
		return -1;
		//return 0;
		
	}
	
}
