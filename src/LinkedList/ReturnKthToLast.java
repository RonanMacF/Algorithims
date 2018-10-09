package LinkedList;

//Source: CTCI
//Problem: Return Kth to last element
//Assumption:
//Complexity: T(N) S(1)

public class ReturnKthToLast {
	public static LinkedListNode nthToLat(LinkedListNode head, int k) {
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		
		for(int i = 0; i < k; i++) {
			if(p1 == null) return null;
			p1 = p1.next;
		}
		
		while(p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return p2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
