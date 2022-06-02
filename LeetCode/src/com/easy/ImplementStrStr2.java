package com.easy;

public class ImplementStrStr2 {

	public static int strStr(String haystack, String needle) {
        
		char[] c1 = haystack.toCharArray();	//mississippi
		char[] c2 = needle.toCharArray();	// issip
		
		int j = 0;
		
		int l = 0;	//2
		
		int k1 = needle.length()-1;
		
		boolean flag4 = false;
		
		if(needle.length()==0) {
			return 0;
		}
		
		//"mississippi"
		// "issip"
		
		if(needle.length()<=haystack.length()) {		//logic for substring
			
			for(int i = 0; i<needle.length(); i++) {	//i	//0
			
				for(int k = l; k<haystack.length(); k++) {	//mi	//01
				
					if(c1[k]==c2[i]) {
					
						l += k;		//2
						
						if(needle.substring(0, needle.length())==haystack.substring(k, k+k1+1))
							flag4 = true;
						else {
							return -1;
						}
									
						 
						break;
					}
				}
				break;
			}
		}else {
			return -1;
		}
		
		
		
		
		
		if(flag4) {
			j = haystack.indexOf(c2[0]);
		}
		else {
			return -1;
		}
		
//		if(flag) {
//			return -1;
//		}else if(flag2){
//			return -1;
//		}
//		else {
//			j = haystack.indexOf(c2[0]);
//		}
		

		if(needle.length()==0||j==0) {
			return 0;
		}
		else {
		
			if(j>0) {
				return j;
			}else {
				return -1;
			}
		}
		
    }
	
	public static void main(String[] args) {
		
		String hayStack = "mississippi";
		
		String needle = "issip";
		
		System.out.println(strStr(hayStack, needle));
		
	}
	
}
