import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Source: LeetCode
//Problem: Return list of all numbes that when added together is - 0. Must not contain duplicated
//Assumption:
//Complexity: T(N^2) S(?)

// Sort the array and then bring the using two pointers search for match.
public class ThreeSum {
	public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>(); 
        
        for (int i = 0; i < num.length-2; i++) {
            
            if(i == 0 || num[i] != num[i-1]) {
                // Initialise Variables
                int lo = i+1, hi = num.length-1, sum = -num[i];
                
                // Simply check all the numbers thereafter 
                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } 
                    else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
               }
            }
        }
        return res;
    }

}
