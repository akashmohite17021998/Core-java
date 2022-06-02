package com.easy;

public class ImplementStrStr {

	public static int strStr(String haystack, String needle) {
        
		char[] c1 = haystack.toCharArray();	//mississippi
		char[] c2 = needle.toCharArray();	// issip
		
		int j = 0;
		
		int l = 0;	//2
		
		int k1 = needle.length()-1;
		
		boolean flag = true;	// true false
		
		boolean flag2 = false;
		
		boolean flag3 = false;
		
		boolean flag4 = false;
		
		if(needle.length()==0) {
			return 0;
		}
		
		//"mississippi"
		// "issip"
		
		if(needle.length()<=haystack.length()) {		//logic for substring
			
			for(int i = 0; i<needle.length(); i++) {	//issip	//01234
			
				for(int k = l; k<haystack.length(); k++) {	//missis	//012345
				
					if(c1[k]==c2[i]) {
					
						l += k;
						
						if(needle.substring(0, needle.length()-1)==haystack.substring(k, k+k1))
							flag4 = true;
						
									//5
						flag = false; 
						break;
					}else if(flag){	//true false
						
						
						
					}else {
						flag2 = true;
						break;
					}
				
				}
				if(flag2) {
					break;
				}
			
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
		
		String hayStack = "hello";
		
		String needle = "ll";
		
		System.out.println(strStr(hayStack, needle));
		
	}
	
}
