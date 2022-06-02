package com.suprressannotation;

import java.util.ArrayList;

public class SuprressWarnningAnnotation {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("sonoo");
		list.add("vimal");
		list.add("ratan");
		
		System.out.println(list);
	}
}
