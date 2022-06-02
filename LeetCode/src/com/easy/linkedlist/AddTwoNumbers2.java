package com.easy.linkedlist;

public class AddTwoNumbers2 {

	public static class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public ListNode addTwoNumbers(ListNode a, ListNode b) {	//2,4,3
        													//5,6,4
		ListNode c = a;
		ListNode d = b;
		
		ListNode g = new ListNode();
		
		int e = 0;
		int f = 0;
		int lcm = 0;
        
        int aSize = 0;
        int bSize = 0;
        
        while(c!=null){
            aSize++;
            c = c.next;
        }
        while(d!=null){
            bSize++;
            d = d.next;
        }
        
        c = a;
        d = b;
        		
        if(aSize!=bSize){   		//Logic when both LinkedList is not equal
            
            if(aSize>bSize){		//Logic when a>b
                
                while(c!=null){
                    
                    if(d!=null){	
                        
                        e = c.val+d.val+lcm;
                        
                        if(e>9){
                            
                            f = e%10;
                            lcm = e/10;
                            c.val = f;
                            c = c.next;
                            d = d.next;
                            
                        }else{
                            
                            c.val = e;
                            lcm = 0;
                            c = c.next;
                            d = d.next;
                        }
                        
                    }else{
                        
                    	if(c.next!=null) {
                    		
                    		e = c.val+lcm;
                        
                    		if(e>9){
                            
                    			f = e%10;
                    			lcm = e/10;
                    			c.val = f;
                    			c = c.next;
                            
                    		}else{
                            
                    			c.val = e;
                    			lcm = 0;
                    			c = c.next;
                            
                    		}
                    	}else {
                    		
                    		e = c.val+lcm;
                    		
                    		if(lcm!=0) {
                    			
                    			c.val = f;
                        		c.next = g;
                        		g.val = lcm;
                        		c = c.next;
                        		c.next = null;
                        		
                    		}else {
                    			c.val = e;
                    			c = c.next;
                    		}
                    	}
                    }
                }
            }
            //return a;
        }else{                      //logic when both linked list with same size
            while(c!=null) {
			
			    e = c.val+d.val+lcm;
			    if(e>9) {
				
			    	if(c.next!=null) {
			    		f = (e%10);
			    		lcm = (e/10);
			    		c.val = f;
			    		c = c.next;
			    		d = d.next;
			    	}else {
			    		f = (e%10);
			    		lcm = (e/10);
			    		c.val = f;
			    		c.next = g;
			    		g.val = lcm;
			    		g.next = null;
			    		c = c.next.next;
			    	}
				
			    }else {
				    c.val = e;
				    c = c.next;
				    d = d.next;
			    }
			
		    }
		
        }
		
		return a;
    }
	
}
