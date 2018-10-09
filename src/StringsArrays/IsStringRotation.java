// Source: CTCI Chapter 1 Question 9
// Problem: Assuming you have a isSubstring Function, determine if one string is rotation f the other
// Assumption: case insensitive
// Complexity: Assuming the substring is O(A+B) then: T(N) S(N)

public class IsStringRotation {
	
	boolean isRotations(String s1, String s2) {
		int len = s1.length();
		if(len == 0 || len != s2.length()) return false;
		
		//String s1s1 = s1+s1;
		//return isSubStr(s1s1, s2);
		return true;
	}
}

