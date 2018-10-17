package Tree;

public class CheckBalanced {
	public boolean isBalanced(TreeNode root) {
		return checkHeight(root) != Integer.MIN_VALUE;
	}
	
	public int checkHeight(TreeNode node){
		
		int leftHeight = checkHeight(node.left);
		if(leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
		
		int rightHeight = checkHeight(node.right);
		if(rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
		
		int difference = leftHeight - rightHeight;
		if(Math.abs(difference) > 1) return Integer.MIN_VALUE;
		else return Math.max(leftHeight, rightHeight) + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
