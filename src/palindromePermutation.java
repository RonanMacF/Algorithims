//Source: CTCI Chapter 1 Question 4
//Problem: Given a String determine if it is a permuatation of a palindrome
//Assumption: Spaces do not matter, case insensitive
//Complexity: T(N) S(1)

public class palindromePermutation {
	
	static boolean isPalindrone(String phrase) {
		// Create bitVector
		int bitVector = 0;
		int letter, mask;
		
		for (char c : phrase.toCharArray()) {	// Convert entire string in char []
			letter = c - 'a';						// normalize data with a being 0
			mask = 1 << letter;
			if((bitVector & mask) == 0) bitVector |= mask;		// If the bit is not set, add it in
			else bitVector &= ~mask;							// else remove that bit while keeping everything else
		}

		return (bitVector & (bitVector-1)) == 0;		// Check only 1 bit is left
	}

}

