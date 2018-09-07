import java.util.ArrayList;
import java.util.List;

//	EPI, given a linked list representing an integer. Increment it by 1

//	Brute: Convert LL to Integer, Increment then convert it back. Possible Ineger overflow issue

//	S(N) T(1)
public class IncrementArbitrartPrecisionIntegerLL {

	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>();
		A.add(9);
		A.add(9);
		A.add(9);
		A.add(9);

		A = plusOne(A);
		for(int i = 0; i < A.size(); i++) {
            System.out.print(A.get(i) + ", ");
        }
	}
	
	public static List<Integer> plusOne (List<Integer> A){
		int n = A.size() - 1;
		A.set(n, A.get(n) + 1);
		
		for(int i = n; i > 0 && A.get(i) == 10; i--){
			A.set(i, 0);
			A.set(i-1, A.get(i-1)+1);
		}
		
		// If the last digit is 10, e.g (9,9,9) then add a 0 to the end and make beginning 1
		if(A.get(0) == 10) {
			A.set(0,1);
			A.add(0);
		}
		
		return A;
	}

}
