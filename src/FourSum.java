import java.util.HashMap;
import java.util.Map;
//Source: LeetCode Hard
//Problem: Return number of times 1 element from each array adds up to 0
//Assumption:
//Complexity: T(N^2) S(N^2)

public class FourSum {

	public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 
        for(int a : A)
            for(int b : B){
                int s = a+b;
                map.put( s, map.getOrDefault(s, 0)+1 ); 
            }
        
        int result=0;
        for(int c : C)
            for(int d : D){
                int s = -c-d;
                result += map.getOrDefault(s, 0);
            }
        return result; 
    }
	
	public static void main(String[] args) {

	}

}
