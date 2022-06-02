package com.apnacollege.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeYT {

	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static class BinaryTree{
		int idx = -1;
		public Node buildTree(int[] nodes) {
			
			idx++;
			
			if(nodes[idx]==-1) {
				return null;
			}
		
			Node newNode = new Node(nodes[idx]);
			
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			
			return newNode;
		}
	}
	
	public void preOrder(Node root) {	//DFS depth first search
		
		if(root==null) {
			System.out.print(-1+ ", ");
			return;
		}
		
		System.out.print(root.data+", ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void inOrder(Node root) {	//DFS depth first search
		
		if(root==null) {
			System.out.print(-1 + ", ");
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data + ", ");
		inOrder(root.right);
		
	}
	
	public void postOrder(Node root) {	//DFS depth first search
		
		if(root==null) {
			System.out.print(-1 + ", ");
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + ", ");
		
	}
	
	public void levelOrder(Node root) {	//BFS Breadth-First Search level order
		
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node curr = q.remove();
			if(curr==null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}else {
					q.add(null);
				}
				
				
			}else {
				if(curr.left!=null) {
					q.add(curr.left);
				}
				if(curr.right!=null) {
					q.add(curr.right);
				}
				System.out.print(curr.data + " ");
			}
			
		}
		
		
	}
	
	public int count(Node n) {
		
		if(n == null) {
			return 0;
		}
		
		int a = count(n.left);
		int b = count(n.right);
		
		return a+b+1;
		
	}
	
	public int sum(Node root) {
		
		if(root==null) {
			return 0;
		}
		
		int a = sum(root.left);
		int b = sum(root.right);
		
		return a+b+root.data;
		
	}
	
	public int height(Node root) {
		
		if(root == null)
			return 0;
		
		int left = height(root.left);
		int right = height(root.right);
		
		int myHeight = Math.max(left, right)+1;
		
		return myHeight;
		
	}
	
//	public int diameter(Node root) {
//		if(root==null) {
//			return 0;
//		}
//		int diam1 = diameter(root.left);
//		int diam2 = diameter(root.right);
//		int diam3 = heig ht(root.left)+height(root.right)+1;
//		
//		return Math.max(diam3, Math.max(diam2, diam1));
//		
//	}
	
	public int diameter(Node root) {
		
		if(root == null)
			return 0;
		
		int diam1 = diameter(root.left);
		int diam2 = diameter(root.right);
		int diam3 = height(root.left)+height(root.right)+1;
		
		return Math.max(diam3, Math.max(diam2, diam1));
		
	}
	
	static class TreeInfo {
		
		int diam;
		int ht;
		
		public TreeInfo(int diam, int ht) {
			this.diam = diam;
			this.ht = ht;
		}
		
	}
	
	public TreeInfo diameter2(Node root) {
		
		if(root == null)
			return new TreeInfo(0, 0);
		
		TreeInfo left = diameter2(root.left);
		TreeInfo right = diameter2(root.right);
		
		int myHeight = Math.max(left.ht, right.ht) + 1;
		
		int diam1 = left.diam;
		int diam2 = right.diam;
		int diam3 = left.ht + right.ht + 1;
		
		int mydiam = Math.max(Math.max(diam1, diam2), diam3);
		
		TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
		
		return myInfo;
				
	}
	
	public static void main(String[] args) {
		int[] nodes = {1, 2, 4 ,-1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
		
		BinaryTree tree = new BinaryTree();
		
		Node root = tree.buildTree(nodes);
		
		//System.out.println(root.data);
		
		BinaryTreeYT t = new BinaryTreeYT();
		
		System.out.println("Preorder : ");
		t.preOrder(root);
		
		System.out.println("\nInoreder : ");
		t.inOrder(root);
		
		System.out.println("\nPostorder : ");
		t.postOrder(root); 
		
		System.out.println("\nLevelorder : ");
		t.levelOrder(root);
		
		System.out.println("\nCount : ");
		System.out.println(t.count(root));
		
		System.out.println("\nSum : ");
		System.out.println(t.sum(root));
		
		System.out.println("\nHeight : ");
		System.out.println(t.height(root));
		
		System.out.println("\nDiameter : ");
		System.out.println(t.diameter(root));
		
		System.out.println("\nDiameter2 : ");
		System.out.println(t.diameter2(root).diam);
	}
}
