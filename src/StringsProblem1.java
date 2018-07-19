// Time = O(n) Space = O(1)
public class StringsProblem1 {

	boolean isUnique(String str) {
		int checker = 0;
		int val;
		
		for(int i = 0; i < str.length(); i++) {
			val = str.charAt(i) - 'a';
			if((checker & (1 << val)) > 0) return false;
			checker |= 1 << val;
		}
		
		return true;
	}
}
