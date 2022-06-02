package com.easy;

public class BestTimeToBuyAndSellStock {

	public static int maxProfit(int[] z) {
		
//		int a = 0;	//4
//		
//		for(int i = 0; i<z.length; i++) {			//1
//			
//			for(int j = i+1; j<z.length; j++) {		//3
//				
//				if(z[i]<z[j]) {
//					
//					if(z[j]-z[i]>a)
//						a=z[j]-z[i];
//				}
//				
//			}
//			
//		}
//		
//		return a;
		
		
		
		if(z.length>10) {
			int a = z[0];
			
			int b = 0;
			
			int c = 0;
			
			for(int i = 1; i<z.length; i++) {
				
				if(z[i]<a) {
					a = z[i];
					b = i;
				}
				
			}
			for(int i = b; i<z.length; i++) {
				if(z[i]>c) {
					c = z[i];
					
				}
			}
			return c-a;
		}
		else {
		
		int a = 0;	//4
		
		for(int i = 0; i<z.length; i++) {			//1
			
			for(int j = i+1; j<z.length; j++) {		//3
				
				if(z[i]<z[j]) {
					
					if(z[j]-z[i]>a)
						a=z[j]-z[i];
				}
				
			}
			
		}
		
		return a;
		
		}
		
		
		
	}
	
	public static void main(String[] args) {
		int[] i = {2,4,1};
		
		System.out.println(maxProfit(i));
	}
}
