package com.easycom.easy.bitmanipulation;

public class AddBinary67 {

	public static String addBinary(String a, String b) {
        
        int c = (a.length()>b.length())?a.length():b.length();    //for loop iteration | which one is larger
        
        int d = (a.length()<b.length())?a.length():b.length();    //which one is smaller
        
        StringBuffer sb = new StringBuffer();
        
        if(b.length()>a.length()){  //if b is greater than a then swap a and b
            
            String temp = "";
            
            temp = b;
            
            b = a;
            
            a = temp;
            
        }
        
        int lcm = 0;
        
        for(int i = 0; i<c; i++){
            
            if(i>=d){                       //if i exceed the length
                
                if(lcm == 1){
                    
                    sb.append(0);
                    lcm = 1;
                    
                }else{
                    
                    sb.append(1);
                    
                }
                
            }else{                              //if i do not exceed the length
                
                if(a.charAt(i)==49&&b.charAt(i)==49){
                    
                    sb.append(0+lcm);
                    
                    lcm = 1;
                    
                }else if((a.charAt(i)==49&&b.charAt(i)==48)||(a.charAt(i)==48&&b.charAt(i)==49)){
                    if(lcm == 1){
                        
                        sb.append(0);
                        lcm = 1;
                        
                    }else{
                        sb.append(1);
                        lcm = 0;
                    }
                    
                    
                }else if(a.charAt(i)==48&&b.charAt(i)==48){
                    
                    if(lcm==1){
                        sb.append(1);
                    }else{
                        sb.append(0);
                    }
                    
                }
                
            }
            
        }
        
        if(lcm == 1){
            sb.append(1);
        }
        
        return sb.reverse().toString();
        
    }

	public static void main(String[] args) {
		String a = "1010";
		String b = "1011";
		
		System.out.println(addBinary(a, b));
	}
}
