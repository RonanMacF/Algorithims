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
