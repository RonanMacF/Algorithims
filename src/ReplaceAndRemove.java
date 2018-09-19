//Source: EPI Chapter 6 Question 6
//Problem: Given a string, replace 'a' with 'dd' and remove b's
//Assumption: There is enough space in the array to hold the final result, size is the amount of characters to be looked at
//Complexity: T(N) S(1)

public class ReplaceAndRemove {
	
	public static int RandR(int size, char[] s) {
		// Scan 1: Forward Iteration: Count a's and skip b's
		int writeIdx = 0, aCount = 0;
		for(int i = 0; i < size; i++) {
			if(s[i] != 'b') {
				s[writeIdx++] = s[i];
			}
			
			if(s[i] == 'a') {
				aCount++;
			}
		}
		
		// Scan 2: Backward Iteration: Replace a's
		int currIndex = writeIdx - 1;
		writeIdx = writeIdx + aCount - 1;
		final int finalSize = writeIdx + 1;
		
		while(currIndex >= 0) {
			if(s[currIndex] == 'a') {
				s[writeIdx--] = 'd';
				s[writeIdx--] = 'd';
			}else {
				s[writeIdx--] = s[currIndex];
			}
			currIndex--;
		}
		return finalSize;
	}
	
	public static void main(String[] args) {
		char[] input = new char[] {'a','b','c','a',' ',' ',' '};
		int num = RandR(4, input);
		for(int i = 0; i < num; i++) {
			System.out.print(input[i] + ", ");

		}
	}
}
