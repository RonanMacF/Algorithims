
public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int[] input = new int[] {1,3,-1,-3,5,3,6,7};
		maxSlidingWindow(input, 3);
	}

	public static int[] maxSlidingWindow(int[] nums, int k) {
        int max = 0;
        int[] output = new int[nums.length-k+1];
        for(int i = 0; i < k; i++){
            max += nums[i];
        }
        
        int outputIndex = 0;
        for(int i = k; i<nums.length; i++){
        	System.out.println(max);
            max += nums[i];
            max -= Math.abs(nums[i-k]);
            
        }
        
        return output;
    }
}
