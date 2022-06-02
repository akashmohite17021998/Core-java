package com.easy.linkedlist;

public class RemoveLinkedListElements203 {

	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public ListNode removeElements(ListNode head, int c) {
        
		if((head==null))
			return head;
		
//		if(head.val==a) {
//			head = head.next;
//		}
		
		ListNode a = head.next;
		ListNode b = head;
		
		while(a.next!=null) {
			
			if(a.val==c) {
				a = a.next;
				if(a.val!=c) {
					b.next = a;
					a = a.next;
					b = b.next;
				}
			}else {
			
				a = a.next;
				b = b.next;
				
			}
		}
		if(a.val==c) {
			b.next = null;
		}
		return head;
    }
}
