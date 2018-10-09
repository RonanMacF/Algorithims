// Source: CTCI Chapter 1 Question 2
// Problem: Check if one string is an exact permutation of another
// Assumptions: Case Sensitive and whitespace is significant
// Complexity: T(N) S(1)

// Naive solution could be to sort both Strings and compare them together to see if equal
public class isExactPermutation {

	boolean isPermutation(String s1, String s2) {
		int len = s1.length();
		if (len != s2.length())
			return false;
		
		int[] charCount = new int[128]; // 128 for ASCII
		for (int i = 0; i < len; i++) 
			charCount[s1.charAt(i)]++;
		
		
		for (int i = 0; i < len; i++) {
			char c = s2.charAt(i);
			charCount[c]--;
			if(charCount[c] < 0) return false;
		}
		return true;
	}
}
