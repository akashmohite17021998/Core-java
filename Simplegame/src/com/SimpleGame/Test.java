package com.SimpleGame;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of days : ");
        int numberOfDays = sc.nextInt();
        System.out.println("Enter the shoes : ");
        int dDayOfLoki = sc.nextInt();

        System.out.println("enter temp");
        int a = sc.nextInt();

        int limit = 0;

        int shoeSwitch = 0;
        
        int b = a;

        for(int i = 0; i<numberOfDays-1; i++){

            if(a<0){
                limit++;

                if((b>=0)){
                    shoeSwitch++;
                }

                b=a;
            }else{

                if((b<0)){
                    shoeSwitch++;
                }

                b = a;
            }

            System.out.println("enter temp");
            a = sc.nextInt();
            
        }

        if(limit>dDayOfLoki){
            System.out.println("NOT POSSIBLE");
        }else{
            System.out.println(shoeSwitch); 
        }
	}

}
