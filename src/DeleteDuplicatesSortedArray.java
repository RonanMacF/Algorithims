//Source: EPI Chapter 5 Question 5
//Problem: Remove Duplicates
//Assumption:
//Complexity: T(N) S(1)
//Additional: 

public class DeleteDuplicatesSortedArray {

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) 
			return 0;
		
		int pos = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[pos - 1]) {
				nums[pos++] = nums[i];
			}
		}
		return pos;
	}

	public static void main(String[] args) {
		int[] input = new int[] {1,2,3,3,4,4,4,5,5,5};
		int num = removeDuplicates(input);
		for(int i = 0; i < num; i++) {
			System.out.print(input[i] + ", ");
		}
	}

}
