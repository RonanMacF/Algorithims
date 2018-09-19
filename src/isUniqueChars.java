// Source: CTCI Chapeter 1 Problem 1
// Problem: Check if all characters are unique in a given String
// Assumption: All lowercase chars
// Complexity: Time = O(n) Space = O(1)

public class isUniqueChars {

	boolean isUnique(String str) {
		int checker = 0; //26 letters = use bitvector
		int val;
		
		for(int i = 0; i < str.length(); i++) {
			val = str.charAt(i) - 'a';
			if((checker & (1 << val)) > 0) return false;
			checker |= 1 << val;
		}
		return true;
	}
}
