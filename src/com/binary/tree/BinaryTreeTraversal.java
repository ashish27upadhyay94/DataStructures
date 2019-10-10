package com.binary.tree;

public class BinaryTreeTraversal {

	//inorder
	
	public void inOrder(BinaryNode node) {
		
		if(node==null) {
			return;
		}
		
		inOrder(node.left);
		System.out.println(node.key);
		inOrder(node.right);
	}
	
	//preorder
	
	public void preOrder(BinaryNode node) {
		
		if(node ==null)
			return;
		
		System.out.println(node.key);
		preOrder(node.left);
		preOrder(node.right);
	}
}
