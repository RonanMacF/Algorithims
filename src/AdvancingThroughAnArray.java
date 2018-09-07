import java.util.ArrayList;
import java.util.List;

// Given a List of integers representing how far you can jump forward, determine the minimum amount of steps required to reach the end, if possible
// S(1)
// T(N)
public class AdvancingThroughAnArray {

	public static int minSteps(List<Integer> positions) {
		if(!canReachEnd(positions)) return -1;
		
		int previous = 0;
		for(int i = 0; i < positions.size(); i++) {
			positions.set(i, Math.max(previous, i + positions.get(i)));
			previous = positions.get(i);
		}

		int count = 0;
		int startingIndex = 0;
		while(startingIndex < positions.size() - 1) {
			int index1 = positions.lastIndexOf(positions.get(startingIndex));
			int index2 = positions.lastIndexOf(positions.get(index1));
			
			int length1 = index1 - startingIndex;
			int length2 = index2 - index1 - 1;
			
			startingIndex = length1 > length2 ? index1 +1 : index2+1;	
			count++;
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
