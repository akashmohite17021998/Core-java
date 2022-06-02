package LangPackage2;

import java.util.ArrayList;

public class Test03 {
	public String toString() {
		return "Test";
	}
	
	public static void main(String[] args) {
		String s = new String("Durga");
		System.out.println(s);
		
		Integer I = new Integer(10);
		System.out.println(I);
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("B");
		System.out.println(al);
		
		Test03 t = new Test03();
		System.out.println(t);
	}

}
