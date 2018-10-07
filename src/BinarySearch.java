// Binary Search questions generally come under 3 main templates, I will explain each of them here.

public class BinarySearch {
	// -------------------------------------------
	// CLASSIC BINARYSEARCH
	// -------------------------------------------
	
	public static int classBinarySearch(int[] nums, int A) {
		int lo = 0, hi = nums.length -1;
		
		while(lo < hi) {
			int mid = lo + (hi - lo)/2;
			if(nums[mid] > A) hi = mid;
			else lo = mid + 1;
		}
		return nums[hi] == A ? hi : -1;
	}
	
	// -------------------------------------------
	// Template 1
	// -------------------------------------------
	// This template uses the classic binary search way, no pre or post processing is required and exit condition is standard
	// lo = mid + 1, hi = mid - 1
	// -------------------------------------------

	public static int mySqrt(int num) {
		// we know Square root wont be in the top half
		int lo = 1, hi = num/2, ans = 0;
		if(num == 0 | num == 1) return num;
		
		while(lo <= hi) {
			int mid = lo + (hi - lo)/2;
			if(mid <= num/ mid) {
				ans = mid;
				lo = mid + 1;
			}else {
				hi = mid - 1;
			}
		}
		return ans;
	}
	
	public static int BinarySearchRotated(int[] A, int num) {
		int lo = 1, hi = A.length - 1;
		if(num == 0 | num == 1) return -1;
		
		while(lo <= hi) {
			int mid = lo + (hi - lo)/2;
			if(A[mid] == num) return mid;
			
			// we are in the left sorted array
			if(A[lo] < A[mid]) {
				if(num < A[lo] || num > A[mid]) lo = mid + 1;
				else hi = mid - 1;
			} 
			
			else if (A[mid] > A[hi]) {
				if(num < A[mid] || num > A[hi]) hi = mid - 1;
				else lo = mid + 1;
			}
			
			// This is done incase the array has duplicates, if no duplicates the above else if can be an else
			else {
				if(A[lo] == A[mid]) lo++;
				else hi--;
			}	
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] input = new int[] {5,7,8,8,8,8,8,8,8,10};
		int a = 64;
		System.out.println(classBinarySearch(input, 8));
		System.out.println(input.length - 2);

	}
}
