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
	
	public static int missingNumber(int a[]) {
	    int lo = 0;
	    int hi = a.length - 1; 

	    // All elements present? If so, return next largest number.
	    if((hi-lo) == (a[hi]-a[lo])) { return a[hi]+1; }

	    // While 2 or more elements to left to consider...
	    while((hi-lo) >= 2) { 
	        int mid = lo + ( hi- lo) / 2;
	        if((mid-lo) != (a[mid]-a[lo])) {  // Explore left-hand side
	            hi = mid;
	        } else {  // Explore right hand side
	            lo = mid + 1;
	        }
	    }

	    // Return missing value from the two candidates remaining...
	    return (lo == (a[lo]-a[0])) ? hi + a[0] : lo + a[0];
	}
	
	public static void main(String [] args) {
		int a = 2;
		int[] b = new int[]{0,1,2,3,5,6};
		
		System.out.println(missingNumber(b));
		
		
		a ^= 3;
		System.out.println(a);
		a^= 3;
		System.out.println(a);
	}

}
