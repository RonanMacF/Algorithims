//Given an array of integers nums, write a method that returns the "pivot" index of this array.
//We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.

// O(N) Time O(1) space
public class LCFindPivotIndex {

	public int pivotIndex(int[] nums) {
        int total = 0;
        int leftsum = 0;
        for (int num : nums) total += num;
        for (int i = 0; i < nums.length; i++){
            if (leftsum * 2 + nums[i] == total) return i; 
            leftsum += nums[i];
        }
        return -1;
    }
}
