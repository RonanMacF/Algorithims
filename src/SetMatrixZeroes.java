// Given a MxN matrix, if any 0 is present set the entire row + column to 0

public class StringsProblems8 {
// This uses O(N) space
	void setZeros(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];

		// This marks any columns + rows with a 0 in it
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; i < matrix[i].length; i++) {
				if(matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		for(int i = 0; i < row.length; i++) {
			if(row[i]) nullifyRow(matrix,i);
		}
		
		for(int i = 0; i < column.length; i++) {
			if(column[i]) nullifyCol(matrix,i);
		}


	}
	
	void nullifyRow(int[][] matrix, int row) {
		for(int j = 0; j < matrix.length;j++) {
			matrix[row][j] = 0;
		}
	}
	
	void nullifyCol(int[][] matrix, int col) {
		for(int j = 0; j < matrix.length;j++) {
			matrix[j][col] = 0;
		}
	}

// Solution 2
// We can make space O(1) by if a 0 is contained in a matrix, set the corresponsing column on the first row and the corresponding row on the first column
// DOing this we dont need a coolean array but instead just two variables, firstRowZero and firstColZero

}

