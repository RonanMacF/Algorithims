package Tree;
//Source: CTCI 4.2
//Problem: Given sorted unique array, make BST with minimal height
//Assumption: 
//Complexity: T(N) S(N)

public class CreateMinimalTree {
	TreeNode CreateMinimalHeight(int[] arr) {
		return createMinimalBST(arr, 0, arr.length-1);
	}
	
	TreeNode createMinimalBST (int[] arr, int start, int end) {
		if(end < start) return null;
		
		int mid = start + (end - start)/2;
		TreeNode n = new TreeNode(arr[mid]);
		n.left = createMinimalBST(arr, start, mid - 1);
		n.right = createMinimalBST(arr, mid + 1, end);
		return n;
	}
}
