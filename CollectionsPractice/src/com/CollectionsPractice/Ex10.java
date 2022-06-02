package com.CollectionsPractice;
import java.util.*;

public class Ex10 {
	public static void main(String[] args) {
		List<String> List1 = new ArrayList<String>();
		  List1.add("1");
		  List1.add("2");
		  List1.add("3");
		  List1.add("4");
		  System.out.println("List before suffeling: \n" + List1);
		  Collections.shuffle(List1);
		  System.out.println("List after suffeling: \n" + List1);
	}

}
