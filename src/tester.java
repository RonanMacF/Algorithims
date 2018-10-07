import java.util.Arrays;
import java.util.HashMap;

public class tester {
	public static int hammingDistance(int x, int y) {
        int xor = x ^ y, count = 0;
        while(xor != 0){
            count += xor & 1;
            xor >>>= 1;
        }
        return count;
    }
	
	 public static int findShortestSubArray(int[] nums) {
	        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
	        int max = 1;
	        int maxNum = -1;
	        
	        for(int num : nums){
	            int numMax = map.getOrDefault(num, 0) + 1;
	            max = Math.max(numMax, max);
	            if(numMax == max) maxNum = num;
	            map.put(num, numMax);
	        }
	        
	        int firstIndex = 0;
	        while(nums[firstIndex] != maxNum) firstIndex--;
	        System.out.println(nums[firstIndex]);
	        int lastIndex = nums.length - 1;
	        while(nums[lastIndex] != maxNum) lastIndex--;
	        System.out.println(nums[lastIndex]);

	        return lastIndex - firstIndex;
	    }
	 
	 public static int findPeakElement(int[] nums) {
	        int l = 0, r = nums.length - 1, mid;
	        while (l < r) {
	            mid = l + (r - l) / 2;
	            if (nums[mid] > nums[mid + 1])
	                r = mid;
	            else
	                l = mid + 1;
	            System.out.println("l = " + l + " mid=  " +mid +" r= " + r);
	        }
	        return l;
	    }
	 
	 public static int search(int[] nums, int target) {
	        if (nums == null || nums.length == 0) return -1;
	        int l = 0, r = nums.length - 1;
	        
	        while (l <= r) {
	            int m = l + (r - l) / 2;
	            System.out.println("START LOOP = " + l + " " + m + " " + r);
	            if(nums[m] == target) return m;
	            
	            // If the midpoint is part of the left sorted array    
	            if (nums[m] < nums[r]) {
	                // Decide where to split that array
	                if (target < nums[m] || target > nums[r]) r = m - 1;
	                else l = m + 1;
	            } 
	            
	            // midpoint part of the right sorted array
	            else {
	                // Decide where to split that array
	                if (target < nums[l] || target > nums[m]) l = m + 1;
	                else r = m - 1;
	            }
	            System.out.println("END LOOP = " + l + " " + m + " " + r);

	        }
	        return -1;
	    }
	 
	 public static int[] searchRange(int[] nums, int target) {
	        if(nums == null || nums.length == 0) return new int[]{-1,-1};
	        
	        int lo = 0, hi = nums.length-1, mid = 0;
	        while(lo <= hi){
	            mid = lo + (hi - lo)/2;
	            if(nums[mid] < target) lo = mid + 1;
	            else if(nums[mid] > target) hi = mid - 1;
	            else break;
	        }
	        if(nums[mid] != target) return new int[]{-1,-1};
	        int startRange = mid;
	        
	        lo = mid + 1;
	        while(lo <= hi){
	            mid = lo + (hi - lo)/2;
	            if(nums[mid] < target) lo = mid + 1;
	            else if(nums[mid] > target) hi = mid - 1;
	            else break;
	        }
	        
	        if(nums[mid] == target) return new int[]{startRange, mid};
	        else return new int[]{startRange, startRange};
	    }
	 
	 public static int bs(int[] A, int target) {
		 int lo = 0, hi = A.length - 1, mid = 0;
		 
		 while(lo < hi) {
			 mid = lo + (hi - lo)/2;
			 if(A[mid] == target) break;
			 else if(A[mid] > target) hi = mid - 1;
			 else lo = mid + 1;
		 }
		 
		 return mid;
	 }
	
	public static void main(String[] args) {
		int a = 2, b = 49;
		int[] A = new int[] {5,7,7,10};
		int target = 4;
		
//		System.out.println(findPeakElement(input));
		int i = 0, j = A.length -1;
		
		System.out.println(bs(A, 9));

	}
}
