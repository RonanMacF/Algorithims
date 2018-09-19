//Source: EPI Chapter 5 Question 3
//Problem: Given a List of integers representing how far you can jump forward, determine the minimum amount of steps required to reach the end, if possible
//Assumption:
//Complexity: T(N) S(1)
//Additional: 
// T(N)
// S(1)
public class DeleteDuplicatesSortedArray {
	
	 public int removeDuplicates(int[] nums) {
	        int pos = 1;
	        for(int i = 1; i < nums.length; i++){
	            if(nums[i] != nums[pos-1]){
	                nums[pos++] = nums[i];
	            }
	        }
	    return pos;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
