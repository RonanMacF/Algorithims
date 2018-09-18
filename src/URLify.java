// Source: CTCI Chapter 1 Problem 3
// Problem: Function gives you a char [] and wants ' ' replaced with '%20'
// Assumption: 
// Complexity: T(N) S(N)

public class URLify {

	void URLify(char[] sentence, int trueLength) {
		int spaces = 0;
		// find num spaces
		for (int i = 0; i < trueLength; i++) 
			if(sentence[i] == ' ') spaces++;
		
		
		int index = trueLength +  2 * spaces;
		if(trueLength == index) return;
		
		for(int i = trueLength -1; i > 0; i--) {
			if(sentence[i] == ' ') {
				sentence[index-1] = '0';
				sentence[index-2] = '2';
				sentence[index-3] = '%';
				index -= 3;
			}else {
				sentence[index] = sentence[i];
				index--;
			}
		}
	}

}

