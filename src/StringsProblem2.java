// Check if one String is a Permutation of another
// In this case we will say it is case sensitive and whitespace is Significant

// Naive solution could be to sort both Strings and compare them together to see if equal
// Solution below is O(n^2)
public class StringsProblem2 {

	boolean isPermutation(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		int len = s1.length();
		int charSum = 0;
		for (int i = 0; i < len; i++) {
			charSum += s1.charAt(i);
			charSum -= s2.charAt(i);
		}
		return (charSum == 0);
	}
}
