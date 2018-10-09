// Source: EPI Chapter 6 Question 5
// Problem: test if is palindrome, must ignore whitespace, commas etc
// Assumption: case sensitive
// Complexity: T(N) S(1)

public class isPalindrome {

	public static boolean isPalindrome(String str) {
		if(str.isEmpty()) return false;
		int start = 0, end = str.length() -1;
		
		while(start < end) {
			while(start < end && !Character.isLetterOrDigit(str.charAt(start))) start++;
			while(start < end && !Character.isLetterOrDigit(str.charAt(end))) end--;
			if(Character.toLowerCase(str.charAt(start++)) != Character.toLowerCase(str.charAt(end--))) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String input = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(input));
	}

}
