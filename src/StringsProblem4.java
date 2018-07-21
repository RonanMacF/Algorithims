// RUn time O(N)
public class StringsProblem4 {
	
	static boolean isPalindrone(String phrase) {
		// Create bitVector
		int bitVector = 0;
		int x, mask;
		
		for (char c : phrase.toCharArray()) {	// Convert entire string in char []
			x = c - 'a';						// normalize data with a being 0
			mask = 1 << x;
			if((bitVector & mask) == 0) bitVector |= mask;
			else bitVector &= ~mask;
		}

		return (bitVector & (bitVector-1)) == 0;
	}

}
