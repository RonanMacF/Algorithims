package StringsArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Source: EPI Chapter 5 Question 9
//Problem: Return all primes up to given number
//Assumption:
//Complexity: T(N log log N) S(N)
//Additional:One way to do it is to check each number from 2 to N to see if prime. Done by dividing every integer from 2 to square rootN to see if remainder is 0. 
//			Time complexity of this is O(N * sqrtN)
public class EnumerateAllPrimesToN {


	public static List<Integer> genPrimes(int n){
		if(n < 2) return Collections.emptyList();
		List<Boolean> isPrime = new ArrayList<Boolean>(Collections.nCopies(n+1, true));
		List<Integer> output = new ArrayList<Integer>();
		isPrime.set(0, false);
		isPrime.set(1, false);
		
		for(int i = 2; i <= n; i++) {
			if(isPrime.get(i)) 
				output.add(i);
			for(int j = i; j <= n; j += i) 
				isPrime.set(j, false);
		}
		
		return output;
	}
	
	public static void main(String[] args){
		System.out.println(genPrimes(30));
	}
}

