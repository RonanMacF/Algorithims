import java.util.HashSet;
import java.util.Set;

//Source: LeetCode
//Problem: Length of longest substring with no repeating characters
//Assumption:
//Complexity: T(N) S(N)

public class lengthOfLongestSubString {
	public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();

        int maxLen = 0;
        Set<Character> seen = new HashSet<>(); 

        int left = 0, right = 0;
        while(right < s.length()) { 
            while(seen.contains(s.charAt(right)))
                seen.remove(s.charAt(left++));  
            seen.add(s.charAt(right++)); 
            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }
}
