//Source: EPI Chapter 6 Question 3
//Problem: Convert Excel column lettering to number, e.g A = 1, AA = 27 
//Assumption: all well formed
//Complexity: T(N) S(1)

public class SpreadsheetColumnEncoding {
	
	// Assumes A starts at 1
	public static int convertEncoding(final String str) {
		return str.chars().reduce(0, (total, c) -> (total * 26) + (c - 'A') + 1);
	}
	
	// Assumes A starts at 0
	public static int convertEncoding2(final String str) {
		return str.chars().reduce(1, (total, c) -> (total * 26) + (c - 'A') );
	}
	
	public static void main(String[] args) {

		String test = "A";
		System.out.println(convertEncoding2(test));
	}

}
