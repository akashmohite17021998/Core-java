package com.hard.linkedlist;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class Solution {
	
	public static ListNode mergeKLists(ListNode[] lists) {


		
		
		ListNode head = new ListNode();

		ListNode curr = head;

		int count = 0;

		Integer min = lists[0].val;

		int index = 0;

		int comeOut = 0;
		
		boolean flag = true;

		while (comeOut!=10) {
			
			if(flag) {
				for(int i = 0; i<lists.length; i++) {
					
					if(lists[i]!=null) {
						min = lists[i].val;
						
						index = i;
						
						break;
					}
					
				}
				flag = false;
			}

			

			if (lists[index] == null) {
				index++;

				comeOut++;
				
				continue;
			}

			if (min > lists[index].val) {

				min = lists[index].val;

				count = index;

			}

			index++;

			if (index == lists.length) {
				index = 0;
				
				

				lists[count] = lists[count].next;

				curr.next = new ListNode(min);

				curr = curr.next;

				count = 0;
				
				min = null;
				
				flag = true;

			}

		}

		return head.next;

	}

	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
		
		ListNode curr = l1;

		curr.next = new ListNode(4);
		
		curr = curr.next;

		curr.next = new ListNode(5);

		ListNode l2 = new ListNode(1);
		
		curr = l2;

		curr.next = new ListNode(3);
		
		curr = curr.next;

		curr.next = new ListNode(4);

		ListNode l3 = new ListNode(2);
		
		curr = l3;

		curr.next = new ListNode(6);

		ListNode[] list = new ListNode[3];
		
		list[0] = l1;
		
		list[1] = l2;
		
		list[2] = l3;

		ListNode l = mergeKLists(list);
		
		while(l!=null) {
			
			System.out.print(l.val+", ");
			
			l = l.next;
			
		}
		
		

	}
}
