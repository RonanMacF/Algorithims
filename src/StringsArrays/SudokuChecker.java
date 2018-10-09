// Source: EPI Chapter 5 Problem 17
// Problem: Check a give sudoku bored is correct, e.g no two same number on any row, column or box 
// Assumption: 
// Complexity: T(N^2) S(1)

public class SudokuChecker {
	public static boolean isValidSudoku(char[][] board) {
		int[] vset = new int[9];
		int[] hset = new int[9];
		int[] bckt = new int[9];
		int idx = 0;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {

					idx = 1 << (board[i][j] - '0');
					int boxToCheck = ((i / 3) * 3) + j / 3;
					if ((hset[i] & idx) > 0 || (vset[j] & idx) > 0 || (bckt[boxToCheck] & idx) > 0)
						return false;
					hset[i] |= idx;
					vset[j] |= idx;
					bckt[boxToCheck] |= idx;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		char[][] testFalse = new char[][] { { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		char[][] testTrue = new char[][] { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		
		if(isValidSudoku(testTrue))System.out.println("TestTrue correct");
		if(!isValidSudoku(testFalse))System.out.println("TestFalse correct");

	}

}
