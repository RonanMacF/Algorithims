package LinkedList;
//Source: CTCI
//Problem: Delete middle node
//Assumption:
//Complexity: T(1) S(1)
public class DelleteMiddleNode {
	
	public static boolean deleteMiddle(LinkedListNode node) {
		if(node == null || node.next == null) return false;
		
		LinkedListNode next = node.next;
		node.data = next.data;
		node.next = next.next;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
