import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Source: CTCI Chaper 1 Question 6
// Problem: Compressess strings e.g aabbbcccc = a2b3c4, must check compressed String < original
// Assumption: only uppercase and lowercase letters
// Complexity: T(N) S(N)

// Additional we should ideally find the length beforehand to check and see if its worth it, we then set the StringBuilder to that size
// Use Stringbuilder and add Strings has O(l * n2)

public class StringCompression {
	
	public static String compress(String str) {
		StringBuilder compressedStr = new StringBuilder();
		int compressedLen = 0;

		for (int i = 0; i < str.length(); i++) {
			compressedLen++;

			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressedStr.append(str.charAt(i));
				compressedStr.append(compressedLen);
				compressedLen = 0;
			}
		}
		return compressedStr.length() < str.length() ? compressedStr.toString() : str;
	}
	
	public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> output = new ArrayList<Integer>();
        
        for(int i = left; i <= right; i++){
            char[] number = Integer.toString(i).toCharArray();
            boolean add = true;
            int num = 0;
            for(int j = 0; j < number.length; j++){
                num = number[j];
                System.out.println("i = " +i+" num "+num);
                if(i % num != 0 || num == 0){
                    add = false;
                    break;
                }
            }
            
            if(add){
                output.add(num);
            }
        }
        
        return output;
    }
	
	public static void main(String[] args) {
		List<Integer> test = selfDividingNumbers(1,22);
		System.out.println(Arrays.toString(test.toArray()));
	}
	
}


