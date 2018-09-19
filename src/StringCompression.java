// Compressess strings e.g aabbbcccc = a2b3c4, must check compressed String < original
// Use Stringbuilder and add Strings has O(l * n2)

public class StringsProblem6 {
	
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
