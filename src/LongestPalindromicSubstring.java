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
            while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }
        }
		return maxLength;
	}
	
	public static String longestPalindrome(String s) {
        if(s.isEmpty() || s.length() < 2) return null;
        int left = 0, right = 0, maxLen = 1;
        int length = s.length();
        int firstIndex = 0;
       for(int i = 1; i < length; i++){
            
            //assuming even palindrome
           left = i -1;
           right = i;
            while(left >= 0 && right < length && s.charAt(left) == s.charAt(right)){
            	if( right - left  + 1 > maxLen) {
            		maxLen =  right - left  + 1;
                    firstIndex = left;
            	}

                left--;
           right++;
            }
           
            System.out.println("maxLen = " + maxLen + "  firstIndex = " + firstIndex);
           
           //assuming odd palindrome
           left = i -1;
           right = i + 1;
            while(left >= 0 && right < length && s.charAt(left) == s.charAt(right)){
            	if( right - left  + 1 > maxLen) {
            		maxLen = right - left + 1;
                    firstIndex = left;
            	}

                  left--;
           right++;
            }
            System.out.println("maxLen = " + maxLen + "  firstIndex = " + firstIndex);

         
           
        }
   
        return s.substring(firstIndex,firstIndex + maxLen);
        
    }
	
	public static void main(String[] args) {
		System.out.println(longestPalindrome("aaa"));

	}

}
