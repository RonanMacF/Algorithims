package LinkedList;
//Source: CTCI
//Problem: Given an element, partrition an array so all elements smaller appear before and larger appear after
//Assumption:
//Complexity: T(N) S(N)

public class PartritionArray {
	public static LinkedListNode partrition(LinkedListNode node, int x) {
		LinkedListNode beforeStart = null, beforeEnd = null, afterStart = null, afterEnd = null, equalsStart = null, equalsEnd = null;
		
		while(node != null) {
			LinkedListNode next = node.next;
			node.next = null;
			//
			if(node.data < x) {
				if(beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				}else {
					beforeEnd.next = node;
					beforeEnd = node;
				}
			} else if(node.data > x){
				if(beforeStart == null) {
					afterStart = node;
					afterEnd = afterStart;
				}else {
					afterEnd.next = node;
					afterEnd = node;
				}
			}else {
				if(beforeStart == null) {
					equalsStart = node;
					equalsEnd = equalsStart;
				}else {
					equalsEnd.next = node;
					equalsEnd = node;
				}
			}
			node = next;
		}
		
		// messy group start middle and end
		return beforeStart;
	}
}
