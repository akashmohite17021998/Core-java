package com.Protected;
import com.WhizLabs.*;

public class Protected extends Q09 {
	public static void main(String[] args) {
		Q09 a = new Q09();
		a.m1();
		
		Protected a1 =new Protected();
		a1.m1();
		
		Q09 a2 = new Protected();
		a2.m1();
	}

}
