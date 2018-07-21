// given two string, check if they are < 1 edit away from being the same
public class StringsProblem5 {

	public boolean oneEditAway(String s1, String s2) {
		if(s1 == s2) return true;
		else if(s1.length() == s2.length()) return oneEditReplace(s1,s2);
		else if(s1.length() + 1 == s2.length()) return oneEditInsert(s1,s2);
		else if(s1.length() - 1 == s2.length()) return oneEditInsert(s2,s1);
		else return false;
	}
	public boolean oneEditReplace(String s1, String s2) {

		boolean foundDiff = false;
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				if(foundDiff) return false;
				foundDiff = true;
			}			
		}
		return true;
	}
	public boolean oneEditInsert(String s1, String s2) {
		int index1 = 0, index2 = 0;
		
		while(index1 < s1.length() && index2 < s2.length()) {
			if(s1.charAt(index1) != s2.charAt(index2)) {
				if(index1 != index2) return false;
				index2++;
			}
			index1++;
			index2++;		
		}
		return true;
	}
	
	public boolean mergeAll(String first, String second) {
		
		if(Math.abs(first.length() - second.length()) > 1) return false; // If more than 1 char between them then break;
		
		// ensure s1 is the shorter String
		String s1 = first.length() < second.length() ? first : second;
		String s2 = first.length() < second.length() ? second : first;
		
		int index1 = 0, index2 = 0;
		boolean foundDiff = false;
		
		
		while(index1 < s1.length() && index2 < s2.length()) {
			
			//If there is a differnce of character and difference seen before return false as 2 changes, if same length increase index1&2, else just 2
			// If characters are the same increase bothh indexes
			if(s1.charAt(index1) != s2.charAt(index2)) {
				if(foundDiff) return false;
				foundDiff = true;
				
				if(s1.length() == s2.length()) index1++;
			}else {
				index1++;
			}
			
			index2++;
		}

		return true;
		
		
	}
}
