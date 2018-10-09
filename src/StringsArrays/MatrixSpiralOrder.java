import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Source: EPI Chapter 5 Question 18
//Problem: Return List of matrix elements in spiral order
//Assumption: 
//Complexity: T(MN) S(MN)

public class MatrixSpiralOrder {

	public static List<Integer> spiralOrder(int[][] matrix) {

		if (matrix.length == 0 || matrix[0].length == 0)
			return Arrays.asList(0);

		int top = 0;
		int left = 0;
		int bottom = matrix.length - 1;
		int right = matrix[0].length - 1;

		ArrayList<Integer> res = new ArrayList<Integer>();

		while (true) {
			// Do the Top side
			for (int i = left; i <= right; i++)
				res.add(matrix[top][i]);
			top++;
			if (top > bottom || left > right)
				break;

			for (int i = top; i <= bottom; i++)
				res.add(matrix[i][right]);
			right--;
			if (top > bottom || left > right)
				break;

			for (int i = right; i >= left; i--)
				res.add(matrix[bottom][i]);
			bottom--;
			if (top > bottom || left > right)
				break;

			for (int i = bottom; i >= top; i--)
				res.add(matrix[i][left]);
			left++;
			if (top > bottom || left > right)
				break;

		}
		return res;
	}

	public static void main(String[] args) {
		int[][] input = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		List<Integer> test = spiralOrder(input);
		for(int i = 0; i < test.size(); i++) System.out.print(test.get(i) + ", ");
	}
}
