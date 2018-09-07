import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


// Multiply 2 numbers together which are stores as Linked Lists

// T(MN) S(M+N)
public class MultiplyAbritraryPrecisionIntegersLL {

	public static List<Integer> multiply (List<Integer> num1, List<Integer> num2){
		// Check if either is a negative, if so save it and remove it
		final int sign = num1.get(0) < 0 || num2.get(0) < 0 ? -1 : 1;
		num1.set(0, Math.abs(num1.get(0)));
		num2.set(0, Math.abs(num2.get(0)));
		
		// Create list of size M+N and deafult all to 0
		List<Integer> output = new ArrayList<Integer>(Collections.nCopies(num1.size() + num2.size(), 0));
		
		for(int i = num1.size() -1; i >= 0; i--) {
			for(int j = num2.size() -1; j >= 0; j--) {
				// previous num + (number from num1 * number from num2)
				output.set(i + j + 1, output.get(i + j + 1) + num1.get(i) * num2.get(j));
				
				// if > 10 market the next significant but and modulo the current bit
				output.set(i + j, output.get(i + j) + output.get(i + j + 1)/10);
				output.set(i + j + 1, output.get(i + j + 1)%10);
			}
		}
		
		// Remove Leading zeros
		int firstNonZero = 0;
		while(firstNonZero < output.size() && output.get(firstNonZero) == 0) {
			firstNonZero++;
		}
		// If is 0 then return
		output = output.subList(firstNonZero, output.size());
		if(output.isEmpty()) {
			return Arrays.asList(0);
		}
		
		// Mark negative if needs be
		output.set(0, output.get(0) * sign);
		return output;
	}
	
	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>();
		A.add(9);
		A.add(9);
		A.add(9);
		
		List<Integer> B = new ArrayList<Integer>();
		B.add(0);
		
		List<Integer> result = multiply(A,B);
		for(int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + ", ");
        }
	}
}
