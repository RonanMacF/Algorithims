import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Source: EPI Chapter 5 Question 8
//Problem: Given an Array, rearrange them so that A[0] <= A[1] >= A[2] <= A[3].......
//Assumption:
//Complexity: T(N) S(1)
//Additional: One solution could be to sort and interleave the bottom and top half or sort Array and swap pairs, both NlogN


// S(1) & T(N)
public class ComputingAnAlteration {
	public static void rearrange (List<Integer> A) {
		for(int i = 1; i < A.size(); i++) {
			if(((i % 2) == 0 && A.get(i - 1) < A.get(i)) || ((i % 2) != 0 && A.get(i -1) > A.get(i)))
				Collections.swap(A, i -1, i);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>();
		A.add(9);
		A.add(8);
		A.add(7);
		A.add(6);
		A.add(5);
		A.add(4);
		A.add(3);
		rearrange(A);
		
		for(int num : A) {
			System.out.print(num + ", ");
		}
	}
}


// Additional example
// 1,2,3,4,5,6
// 1,2,3	4,5,6
// 1,4,2,5,3,6