package com.practice;

public class PrimeNumber {
	public static void main(String[] args) {
		int a = 13;

        boolean flag = true;

        for(int  i = 2; i<a; i++){

            if(a%i==0){
                flag = false;
            }

        }

        if(flag){
            System.out.println(a + " is a prime number.");
        }
        else{
            System.out.println(a + " is not a prime number.");
        }
	}

}
