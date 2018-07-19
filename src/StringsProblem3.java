// Function gives you a char [] and wants ' ' replaced with '%20'
// given "true length" and buffer at the end of the string

public class StringsProblem3 {

	void URLify(char[] sentence, int trueLength) {
		int spaces = 0;
		for (int i = 0; i < trueLength; i++) {
			if(sentence[i] == ' ') spaces++;
		}
		
		int index = trueLength +  2 * spaces;
		if(trueLength == index) sentence[index] = '\0';
		
		for(int i = trueLength -1; i > 0; i--) {
			if(sentence[i] == ' ') {
				sentence[index-1] = '0';
				sentence[index-2] = '2';
				sentence[index-3] = '%';
				index -= 3;
			}else {
				index--;
				sentence[index] = sentence[i];
			}
		}
	}

}
