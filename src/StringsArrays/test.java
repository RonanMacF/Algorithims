package StringsArrays;

public class test {
	public String func(String s) {
		char[] sa = s.toCharArray();
		int counter =0;
		StringBuilder sb = new StringBuilder();
		
		for(char c : sa) {
			if(Character.isLetterOrDigit(c)) {
				sb.append(c);
				counter++;
				if(counter % 3 == 0) {
					sb.append(" ");
				}
			}
		}
		
		char[] output = sb.toString().toCharArray();
		if(output[output.length - 2] == ' ') {
			char tmp
		}
		
		return new String(output);
	}
}
