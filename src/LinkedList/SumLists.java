package LinkedList;
//Source: CTCI
//Problem: Sum two lists together, lists appear in opposite order
//Assumption:
//Complexity: T(N) S(longer + 1)

public class SumLists {

	public LinkedListNode sum(LinkedListNode num1, LinkedListNode num2) {
		LinkedListNode head = null, next = null;

		int carry  = 0, sum = 0;
		
		while(num1 != null || num2 != null) {
			sum = carry + (num1 == null ? num1.data : 0) + (num2 == null ? num2.data : 0);
			carry = sum / 10;
			LinkedListNode tmp = new LinkedListNode(sum%10);
			
			if(head == null) head = tmp;
			else {
				next.next = tmp;
			}
			
			next = tmp;
			if(num1 != null) num1 = num1.next;
			if(num2 != null) num2 = num1.next;
		}
		
		if(carry > 0) next.next = new LinkedListNode(1);
		
		return head;
	}
}
