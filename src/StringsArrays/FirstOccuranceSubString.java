//Source: EPI Chapter 6 Question 13 and LeetCode
//Problem: Find first occurance of a substring
//Assumption:
//Complexity: T(M+N) S(1)
public class FirstOccuranceSubString {

	public static int rabinKarp(String t, String s) {
		if (s.length() > t.length())
			return -1;

		final int BASE = 26;
		int tHash = 0, sHash = 0; // Hash codes for the substring of t and s.
		int powerS = (int) Math.pow(BASE, s.length() - 1); // BASE^|s|.
		for (int i = 0; i < s.length(); i++) {
			tHash = tHash * BASE + t.charAt(i);
			sHash = sHash * BASE + s.charAt(i);
		}

		for (int i = s.length(); i < t.length(); i++) {
			// Checks the two substrings are actually equal or not, to protect
			// against hash collision.
			if (tHash == sHash && t.substring(i - s.length(), i).equals(s)) {
				return i - s.length(); // Found a match.
			}

			// Uses rolling hash to compute the new hash code.
			tHash -= t.charAt(i - s.length()) * powerS;
			tHash = tHash * BASE + t.charAt(i);
		}
		// Tries to match s and t.substring(t.length() - s.length()).
		if (tHash == sHash && t.substring(t.length() - s.length()).equals(s)) {
			return t.length() - s.length();
		}
		return -1; // s is not a substring of t.
	}

	public static void main(String[] args) {
		String hay = "abcdefghi";
		String needle = "bcde";
		System.out.println(rabinKarp(hay, needle));

	}

}
