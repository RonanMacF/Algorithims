//Source: EPI Chapter 6 Question 1
//Problem: Convert String to Integer and other way
//Assumption: case insensitive
//Complexity: T(N) S(1)

public class InterconvertStringInteger {

	public static String intToString(int num) {
		boolean negative = false;
		if(num < 0) negative = true;
		
		StringBuilder sb = new StringBuilder();
		do {
			sb.append((char)'0'+num%10);
			num /= 10;
		} while(num != 0);
		
		return sb.append(negative ? "-" : "").reverse().toString();
	}
	
	public static int StringtoInt(String str) {
		if(str.length() == 0)
            return 0;
		
		int index = 0;
        int total = 0;
        int sign = 1;
        
        // remove white spaces from the string
		while(index < str.length() && str.charAt(index) == ' ')
            index++;
		
		// Check not at the end
        if (index == str.length()) return 0;
        
        // get the sign
        if(str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }
        
        // Start converting, if hits non digit break and checks for overFlow
        for(int i = index; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            if(digit < 0 || digit > 9) break;
        
            // Return Max or Min depending on the given String
            if((total+digit) > ((Integer.MAX_VALUE/10) + (Integer.MAX_VALUE%10)))
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            
            total = total*10 + digit;
        }
        return total*sign;
	}
}
