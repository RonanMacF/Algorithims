// Given a NxN array, rotate it 90 degrees
// must be O(n2) as has to touch all

public class StringsProblem7 {

	boolean rotateMatrix(int[][] matrix) {
		int n = matrix.length;
		if(n == 0 || n != matrix[0].length ) return false;
		
		for(int layer = 0; layer < n/2; layer++) {
			int last = (n - 1) - layer;
			
			for(int i = layer; i < last; i++) {
				int offset = i - layer;
				
				int top = matrix[layer][i]; // save element to temp
				
				matrix[layer][i] = matrix[last-offset][layer]; // left -> top
				matrix[last-offset][layer] = matrix[last][last-offset]; //bottom -> left
				matrix[last][last-offset] = matrix[i][last];// right -> bottom
				matrix[i][last] = top; //right

			}
		}
		
		return true;
	}
}
