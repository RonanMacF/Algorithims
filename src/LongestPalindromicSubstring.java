// Source: LeetCode
// Problem: Length of the longest palindrone
// Assumption:
// Complexity: T(N^2) S(1)
// Additional: Brute = T(N^3), Dynamic programming is another solution T(N^2) S(N^2)

public class LongestPalindromicSubstring {
	public static int LongestPalSub(String str) {
		int maxLength = 1; 
		 
        int len = str.length();
 
        int low, high;
        
        for (int i = 1; i < len; ++i) 
        {
            // Find the longest even length palindrome with 
            // center points as i-1 and i.
            low = i - 1;
            high = i;
            while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }
            
            
         // Find the longest odd length palindrome with 
            // center point as i
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < len
                    && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }
        }
		return maxLength;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
