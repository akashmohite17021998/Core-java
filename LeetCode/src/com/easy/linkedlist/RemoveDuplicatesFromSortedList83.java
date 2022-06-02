package com.easy.linkedlist;

public class RemoveDuplicatesFromSortedList83 {

	ListNode head;
	private int size;
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public ListNode deleteDuplicates(ListNode head) {
        
		if((head==null)||(head.next==null))
			return head;
		
        ListNode sCurr = head;
        ListNode curr = head.next;
        
        while(curr!=null) {

        	if(sCurr.val!=curr.val) {
        		sCurr.next = curr;
        		sCurr = sCurr.next;
        	}
        	curr = curr.next;
        }
        sCurr.next = curr;
        return head;
    }
	
}
