package edu.csus.csc130.fall2020.assignment3;

public class BTChecker {
	/**
	 * This method checks whether the given binary tree is balanced.  
	 * A binary tree is balanced if and only if for each node
	 * 1) its left subtree is balanced
	 * 2) its right subtree is balanced
	 * 3) the height difference between left and right subtree is at most lg(n)
	 * 
	 * @param root the root of a binary tree
	 * @return true is the tree is balanced otherwise false
	 */
	
	public boolean isBalanced(BST.Node root) {
		// delete the following statement and add your implementation
		System.out.println("newTest");
		int h = height(root);
		if(h == -1) {
			return true;
		}
		else if(h<=log(root.n,2)) {
			System.out.println(height(root));
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public int height(BST.Node root) {
		System.out.println("new");
		if(root == null)
		{
			System.out.println("nulll");
			return -1;
		}
		
		else {
			int leftHeight = height(root.left);
			int rightHeight = height(root.right);
			int maximum = Math.max(leftHeight, rightHeight)+1;
			System.out.println(maximum);
			return(maximum);
		}
	}
	static int log(int x, int base)
	{
	    return (int) (Math.log(x) / Math.log(base));
	}
}
