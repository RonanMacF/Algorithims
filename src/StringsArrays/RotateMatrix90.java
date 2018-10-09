//Source: CTCI Chapter 1 Question 7
//Problem: Given a NxN array, rotate it 90 degrees
//Assumption:
//Complexity: T(N^2) S(1)

public class RotateMatrix90 {

	public static void main(String[] args) {
		int[][] input = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		print(input);
		rotateMatrix(input);
		print(input);
	}

	public static boolean rotateMatrix(int[][] matrix) {
		int n = matrix.length;
		if (n == 0 || n != matrix[0].length)
			return false;

		for (int layer = 0; layer < n / 2; layer++) {
			int last = (n - 1) - layer;

			for (int i = layer; i < last; i++) {
				int offset = i - layer;

				int top = matrix[layer][i]; // save element to temp

				matrix[layer][i] = matrix[last - offset][layer]; // left -> top
				matrix[last - offset][layer] = matrix[last][last - offset]; // bottom -> left
				matrix[last][last - offset] = matrix[i][last];// right -> bottom
				matrix[i][last] = top; // right
			}
		}
		return true;
	}

	public static void print(int[][] array) {
		for (int[] x : array) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}

