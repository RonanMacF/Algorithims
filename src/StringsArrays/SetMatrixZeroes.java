// Source: CTCI Chapeter 1 Problem 8
// Problem: If a 0 is present in a matrix set the entire row and column to 0
// Assumption: n/a
// Complexity: Time = O(n^2) Space = O(1)

public class SetMatrixZeroes {
	// This uses O(N) space
	void setZeros(int[][] matrix) {
		if (matrix == null) {
			return;
		}

		int row = matrix.length;
		int col = matrix[0].length;

		boolean rowHasZero = false;
		boolean colHasZero = false;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
					if (i == 0)
						rowHasZero = true;
					if (j == 0)
						colHasZero = true;
				}
			}
		}

		// first row;
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}

		if (rowHasZero) {
			for (int i = 0; i < col; i++)
				matrix[0][i] = 0;
		}
		if (colHasZero) {
			for (int i = 0; i < row; i++)
				matrix[i][0] = 0;
		}
	}
}
