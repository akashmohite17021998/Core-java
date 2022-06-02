package com.easy;

public class Sqrt {

	public static int mySqrt(int x) {  //2
        
		int a = 0;  //9
        
        int b = 0;  //4
        
        if(x<=3)
            return (x==0)? 0:1;
        
        for(int i = 1; i<=x; i++){
            int c = i*i;    //2*2=4 3*3=9 4*4=16
            
            if(c<=2147483647){
                a=c;
            }else{
                return i;
            }
            
            if(a==x){
                return i;
            }
            else if(x>b && x<a){
                return i-1;
            }
            b=a;    //9
        }
        return 0;
		
		
    }
	
	public static void main(String[] args) {
		int i = 2147483647;	
		
		System.out.println(mySqrt(i));
	}
	
}
