package com.easy.linkedlist;

public class ReverseLinkedList206 {

	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public ListNode reverseList(ListNode head) {
        
		ListNode l = head;
        ListNode r = head.next;
        ListNode temp;
        
        l.next= null;
        
        while(r!=null) {
        	
        	temp = l;
        	l = r;
        	r = r.next;
        	l.next = temp;
        	
        }
		return l;
    }
}
