import java.util.HashSet;
import java.util.Set;

// Given two Strings as Binary, Add them together
// T(M) where M is the Longer string
// S(M+1) Where M is the longer String

public class AddBinary {
	public static String addBinary(String a, String b) {
        StringBuilder output = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            output.append(sum % 2);
            carry = sum / 2;
        }
        if (carry == 1) output.append(carry);
        return output.reverse().toString();
    }
	
	public static int countBinarySubstrings(String s) {
	    int prevRunLength = 0, curRunLength = 1, res = 0;
	    for (int i=1;i<s.length();i++) {
	        if (s.charAt(i) == s.charAt(i-1)) curRunLength++;
	        else {
	            prevRunLength = curRunLength;
	            curRunLength = 1;
	        }
	        if (prevRunLength >= curRunLength) res++;
	    }
	    return res;
	}
	
	public static void main(String[] args) {
		String a = "dvdf";
		System.out.println(countBinarySubstrings("00110"));
	}

}
