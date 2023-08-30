package com.easy;

public class ValidWordAbbreviation408 {

public static boolean validWordAbbreviation(String word, String abbr) {
        
        StringBuffer s1 = new StringBuffer(abbr);
        
        StringBuffer s2 = new StringBuffer(); //1
        
        String s3 = new String();
        
        Integer a = 0;
        
        int b = 0;
        
        boolean flag = false;
        
        for(int i = 0; i<word.length(); i = (a!=0)?a+i:i+1){
            a = 0;
            for(int j = b; j<abbr.length(); j++){
                    //t     l               e
                if(flag&&word.charAt(i)!=s1.charAt(j)){
                    
                    return false;
                    
                }
                else if(s1.charAt(j)<=57&&s1.charAt(j)>=48){
                    
                    System.out.println(s2);
                    System.out.println(s1.charAt(j));
                    s2.append(s1.charAt(j));
                    
                    flag = true;
                    
                }else{
                    
                    if(s2!=null){
                        
                        s3 = s2.toString();
                        System.out.println(s3);
                        a = Integer.parseInt(s3);
                        
                        s2 = null;
                        
                        s3 = null;
                        
                    }else if(b != abbr.length()-1){
                        b++;
                    }
                    
                    break;
                    
                }
                if(b != abbr.length()-1){
                    b++;
                }
                
            }
        }
        return true;
    }

	public static void main(String[] args) {
		String s1 = "apple";
		String s2 = "a2e";
		System.out.println(validWordAbbreviation(s1, s2));
		
	}
}
