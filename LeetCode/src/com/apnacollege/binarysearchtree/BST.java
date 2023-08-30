package com.apnacollege.binarysearchtree;

public class BST {

	public static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
		}
	}
	
	public static Node insert(Node root, int val) {
		
		if(root==null) {
			return new Node(val);
		}
		
		if(root.data>val) {
			root.left = insert(root.left, val);
		}
		else {
			root.right = insert(root.right, val);
		}
		
		return root;
		
	}
	
	public static void inOrder(Node root) {
		
		if(root==null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data);
		inOrder(root.right);
		
	}
	
	public static boolean search(Node root, int key) {	//time complexitiy for binary search tree is O(H)
		
		if(root==null)
			return false;
		
		if(root.data==key) {
			return true;
		}else {
			if(root.data>key) {
				return search(root.left, key);
				
			}else {
				return search(root.right, key);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] values = {8,5,3,1,4,6,10,11,14};
		
		Node root = null;
		
		for(int num:values) {
			root = insert(root, num);
		}
		inOrder(root);
		System.out.println();
		
		System.out.println(search(root, 2));
		
	}
	
}
