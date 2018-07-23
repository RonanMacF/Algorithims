// Assuming you have a isSubstring Function
// Write a function to determine if given two strings, one is a rotation of the other

// Runtime depends on the substring func, but assuming its O(a+b) then isRotation runs in O(N)
public class StringsProblem9 {
	
	boolean isRotations(String s1, String s2) {
		int len = s1.length();
		if(len == 0 || len != s2.length()) return false;
		
		String s1s1 = s1+s1;
		return isSubStr(s1s1, s2);
	}
}
