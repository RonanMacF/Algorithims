package Tree;

import java.util.Stack;

public class TreeOperations {
	private class Node{
		int val;
		Node left,right;
		
		public Node(int val) {
			this.left = null;
			this.right = null;
			this.val = val;
		}
	}
	
	public Node put(Node root, int val) {
		if(root == null) return new Node(val);
		if(val < root.val) root.left = put(root.left, val);
		else root.right = put(root.right, val);
		return root;
	}
	
	public Node get(Node root, int val) {
		if(root == null) return null;
		if(root.val == val) return root;
		
		return val < root.val ? get(root.left, val) : get(root.right, val);
	}

	public Node delete(Node root, int val) {
		if(root == null) return null;
		
		if(val < root.val) root.left = delete(root.left, val);
		else if(val > root.val) root.right = delete(root.right, val);
		else {
			if(root.left == null) return root.right;
			else if(root.right == null) return root.left;
			else {
				Node tmp = root;
				root = min(root.right);
				root.right = deleteMin(tmp.right);
				root.left = tmp.left;
			}
		}
		return root;
	}
	
	public Node deleteMin(Node root) {
		if(root.left == null) return root.right;
		root.left = deleteMin(root.left);
		return root;
	}
	public Node min(Node root) {
		while(root.left != null) {
			root = root.left;
		}
		return root;
	}
	
	public boolean isValidBST(Node root) {
		if(root == null) return true;
		Stack<Node> stack = new Stack<Node>();
		Node prev = null;
		
		while(!stack.isEmpty() || root != null) {
			while(root != null) {
				stack.push(root);
				root = root.left;
			}
			
			root = stack.pop();
			if(prev != null && root.val <= prev.val) return false;
			prev = root;
			root=root.right;
		}
		return true;
	}
	
	public static void main(String[] args) {
	}
}
