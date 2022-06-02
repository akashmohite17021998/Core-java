package com.collectios;

import java.util.HashMap;

public class Ex26 {
	public static void main(String[] args) throws Exception {
		HashMap m = new HashMap();
		Temp t = new Temp();
		
		m.put(t, "Durga");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
	}

}

class Temp{
	public String toString() {
		return "Temp";
	}
	
	public void finalize() {
		System.out.println("Finalize method called");
	}
}