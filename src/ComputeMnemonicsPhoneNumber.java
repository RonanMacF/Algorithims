import java.util.ArrayList;
import java.util.List;
//Source: EPI Chapter 6 Question 7
//Problem: Compute all mnemonics for a given phone number
//Assumption: 
//Complexity: T(4^n(n)) as 4 possible character per digit and need to copy string,  Space unknown

public class ComputeMnemonicsPhoneNumber {
	public static List<String> compute(String number){
		List<String> mnemonics = new ArrayList<>();
		computeAll(number, 0 , new char[number.length()], mnemonics );
		return mnemonics;
	}
	
	private static final String[] mappings = {"0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
	private static void computeAll(String number, int digit, char[] partialMnemonic, List<String> mnemonics) {
		if(digit == number.length()) {
			// All digits processed therefore add partial to list
			mnemonics.add(new String(partialMnemonic));
		}else {
			for(int i = 0; i < mappings[number.charAt(digit) - '0'].length(); i++){
				char c = mappings[number.charAt(digit) - '0'].charAt(i);
				partialMnemonic[digit] = c;
				computeAll(number, digit + 1, partialMnemonic, mnemonics );
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
