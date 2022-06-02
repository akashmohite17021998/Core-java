package java8;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		System.out.println("Enter the input number : ");
		Scanner s = new Scanner(System.in);
		int[] list = new int[10];
		for(int i = 0; i<list.length;i++) {
			list[i] = s.nextInt();
		}
		
		for(Integer i: list) {
			System.out.println(i);
		}
	}

}
