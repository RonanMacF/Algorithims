import java.util.ArrayList;
import java.util.List;

public class BuyingSellingStock {
	// Brute force is compare each element against the rest, keeping track of the max = N^2
	// Brute force v2 = Divide and Conquer, compute best for S[0, n/2] & S[n/2+1, n-1]. Need to see if buy in first subarray and sell in second
	
	// Done by calculating the keeping hold of the minimum and calculating the max each time
	// S(1)
	// T(N)
	public static double computeMaxSingleProfit(List<Double> prices) {
		double max = 0.0, minPrice = Double.MAX_VALUE;
		for(int i = 1; i < prices.size(); i++) {
			max = Math.max(max,prices.get(i) - minPrice);
			minPrice = Math.min(minPrice, prices.get(i));
		}
		return max;
	}
	
	// Calculate total profit earned throughout the days
	public int maxProfit(int[] prices) {
        int sum = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]) sum += prices[i] - prices[i-1];
        }
        return sum;
    }
	

	public static void main(String[] args) {
		List<Double> A = new ArrayList<Double>();
		A.add(310.0);
		A.add(315.0);
		A.add(275.0);
		A.add(295.0);
		A.add(260.0);
		A.add(270.0);
		A.add(290.0);
		A.add(230.0);
		A.add(255.0);
		A.add(250.0);
		System.out.println(computeMaxSingleProfit(A));
	}

}
