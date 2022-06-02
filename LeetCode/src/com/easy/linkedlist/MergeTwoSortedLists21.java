package com.easy.linkedlist;

public class MergeTwoSortedLists21 {

	ListNode head;
	int size = 0;
	public static class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		public void addFirst(int i) {
			// TODO Auto-generated method stub
			
		}
	}

	public static ListNode mergeTwoLists(ListNode a, ListNode b) {
        
        ListNode c = a;
        ListNode d = b;
        ListNode temp = c.next;
        
        while(temp==null) {
        	
        	if((c.val<=d.val)&&(d.val<=temp.val)) {
        		temp = c.next;//optional
        		c.next = d;
        		d = d.next;
        		c = c.next;
        		b = null;
        		while(temp.val>d.val) {
    		
        			d = d.next;
        			c = c.next;
        		}
        	}else {
        		c.next = temp;
        		temp = temp.next;
        		c = c.next;
        	}
        }
        c.next = d;
		return a;
    }
	public void printList() {
		
		if(head==null) {
			System.out.println("List is empty.");
			return;
		}
			
		ListNode curr = head;
		
		while(curr!=null) {
			System.out.print(curr.val + " -> ");
			curr = curr.next;
		}
		
		System.out.print("null");
		System.out.println();
		
	}
	
	public void addFirst(int data) {
		ListNode newNode = new ListNode(data);
		size++;
		if(head==null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		
		head = newNode;
	}
	
	public static void main(String[] args) {
		MergeTwoSortedLists21 a = new MergeTwoSortedLists21();
		MergeTwoSortedLists21 b = new MergeTwoSortedLists21();
		a.addFirst(5);
		a.addFirst(4);
		a.addFirst(1);
		b.addFirst(6);
		b.addFirst(3);
		b.addFirst(2);
		b.addFirst(1);
		a.printList();
		System.out.println();
		b.printList();
		
		MergeTwoSortedLists21.mergeTwoLists(a, b);
	}
}
