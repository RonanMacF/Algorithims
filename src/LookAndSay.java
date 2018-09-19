//Source: EPI Chapter 6 Question 8
//Problem: Give row N, where the rows go "1" "11" (one 1), "21"(two ones) "1211" (one two one one)
//Assumption: 
//Complexity: T(n2^n) as successive number at most twice as big and each number and n iterations: S(2^n)

public class LookAndSay {
	public static String lookSay(int n) {
		String s = "1";
		for (int i = 1; i < n; i++) {
			s = nextNumber(s);
		}
		return s;
	}

	public static String nextNumber(String s) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				i++;
				count++;
			}
			sb.append(count).append(s.charAt(i));
		}
		return sb.toString();
	}
}
