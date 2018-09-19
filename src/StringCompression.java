// Source: CTCI Chaper 1 Question 6
// Problem: Compressess strings e.g aabbbcccc = a2b3c4, must check compressed String < original
// Assumption: only uppercase and lowercase letters
// Complexity: T(N) S(N)

// Additional we should ideally find the length beforehand to check and see if its worth it, we then set the StringBuilder to that size
// Use Stringbuilder and add Strings has O(l * n2)

public class StringCompression {
	
	public static String compress(String str) {
		StringBuilder compressedStr = new StringBuilder();
		int compressedLen = 0;

		for (int i = 0; i < str.length(); i++) {
			compressedLen++;

			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressedStr.append(str.charAt(i));
				compressedStr.append(compressedLen);
				compressedLen = 0;
			}
		}
		return compressedStr.length() < str.length() ? compressedStr.toString() : str;
	}
	
}


