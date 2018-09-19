import java.util.Arrays;
//Source: LeetCode Hard
//Problem: Multiply every element in an array but every other elemnent except itself
//Assumption:
//Complexity: T(N) S(N)

public class ProductExceptSelf {
	public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        
        
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
	
	public static void main(String[] args) {
		int[] input = new int[] {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(input)));

	}

}

