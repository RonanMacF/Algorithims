import java.util.ArrayList;
import java.util.List;

//Source: EPI Chapter 5 Question 4
//Problem: Given a List of integers representing how far you can jump forward, determine the minimum amount of steps required to reach the end, if possible
//Assumption:
//Complexity: T(N) S(1)
//Additional: 


public class AdvancingThroughAnArray {

	public static int minSteps(List<Integer> positions) {
		// Check if its possible
		if(!canReachEnd(positions)) return -1;
		print(positions);
		
		// Change the array to show the furthest index the current index can reach
		int previous = 0;
		for(int i = 0; i < positions.size(); i++) {
			int stepsForward = i + positions.get(i);
			positions.set(i, Math.max(previous, stepsForward));
			previous = stepsForward;
		}
		
		// Count the number of jumps needed
		print(positions);
		int count = 1;
		int curElement = positions.get(0);
		for(int i = 1; i < positions.size() -1; i++) {
			if(curElement > positions.size()) break;
			else if(positions.get(i) != curElement) {
				count++;
				curElement = positions.get(i);
			}
		}
		return count;
	}
	
	public static boolean canReachEnd(List<Integer> maxAdvanceSteps) {
		int furthestReachSoFar = 0, lastIndex = maxAdvanceSteps.size() - 1;
		for(int i = 0; i<= furthestReachSoFar && furthestReachSoFar < lastIndex; i++) {
			furthestReachSoFar = Math.max(furthestReachSoFar, i + maxAdvanceSteps.get(i));
		}
		return furthestReachSoFar >= lastIndex;
	}
	
	public static void print(List<Integer> steps) {
		for(int i = 0; i < steps.size(); i++)
		 {
		    System.out.print(steps.get(i) + ", "); 
		 }
		System.out.println();
	}
	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>();
		A.add(2);
		A.add(1);
		A.add(3);
		A.add(2);
		A.add(2);
		A.add(1);
		A.add(4);
		A.add(1);
		A.add(2);

		System.out.println(minSteps(A));
	}
	
}
