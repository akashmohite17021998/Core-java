package com.easy;

public class LongestCommonPrefix2 {

	public static String longestCommonPrefix(String[] str) {
		
		String s1 = str[0];							//dog
		
		StringBuffer s2 = new StringBuffer();		//
		
		for(int i = 1; i<str.length; i++) {			//12
			
			for(int j = 0; j<str[i].length(); j++) {		//0
				
				String s3 = str[i];					//car
				
				if(i==1) {
						//d				//r
					if(s1.charAt(j)==s3.charAt(j)) {
							s2.append(s3.charAt(j));
					}else {
						break;
					}
				
				}
				else if(s2.capacity()){
					
					if(s2.charAt(j)==s3.charAt(j)) {
						if(s2.charAt(j)!=s3.charAt(j))
							s2.append(s3.charAt(j));
					}else {
						s2.delete(j, s2.length());
						break;
					}
				}
			
			s1 = str[i];
			
			}//inner loop
		
	}//outer loop
		return s2.toString();
	}//static method
	
	public static void main(String[] args) {
		
		String[] strs = {"dog","racecar","car"};
		
		System.out.println(longestCommonPrefix(strs));
		
	}
}
