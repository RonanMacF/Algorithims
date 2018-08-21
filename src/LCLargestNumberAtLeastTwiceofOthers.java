
public class LCLargestNumberAtLeastTwiceofOthers {
	
	public int func(int[] nums) {
		int index = 0;
		int max = nums[index];
		int secondMax = 0;
		int num;
		
		for(int i = 0; i < nums.length; i++) {
			num = nums[i];
			
			if(num > max) {
				index = i;
				secondMax = max;
				max = num;
			}else if(num > secondMax)
				secondMax = num;
				
		}
		return max >= secondMax * 2 ? index : -1;
	}
}
