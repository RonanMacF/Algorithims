import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MultiplyAbritraryPrecisionIntegersLL {

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

	public static List<Integer> multiply (List<Integer> num1, List<Integer> num2){
		final int sign = num1.get(0) < 0 || num2.get(0) < 0 ? -1 : 1;
		num1.set(0, Math.abs(num1.get(0)));
		num2.set(0, Math.abs(num2.get(0)));

		List<Integer> output = new ArrayList<Integer>(Collections.nCopies(num1.size() + num2.size(), 0));
		
		for(int i = num1.size() -1; i >= 0; i--) {
			for(int j = num2.size() -1; j >= 0; j--) {
				output.set(i + j + 1, output.get(i + j + 1) + num1.get(i) * num2.get(j));
				
				output.set(i + j, output.get(i + j) + output.get(i + j + 1)/10);
				output.set(i + j + 1, output.get(i + j + 1)%10);
			}
		}
		
		int firstNonZero = 0;
		while(firstNonZero < output.size() && output.get(firstNonZero) == 0) {
			firstNonZero++;
		}
		output = output.subList(firstNonZero, output.size());
		if(output.isEmpty()) {
			return Arrays.asList(0);
		}
		output.set(0, output.get(0) * sign);
	
		return output;
	}
}
