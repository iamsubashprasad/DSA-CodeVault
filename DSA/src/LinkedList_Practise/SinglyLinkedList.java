package LinkedList_Practise;

public class SinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head  = new Node(10);
		 head.next = new Node(20);
		 head.next.next = new Node(30);
		 head.next.next = new Node(40);
		printlist (head);
	}
	public static void printlist(Node head) {
		Node curr = head;
		while(curr!= null) {
			
			curr= curr.next;
			System.out.println(curr.value+" ");
		}
		
	}
}


	class Node
	{
		public int value ;
		public Node next;
		Node (int X){
			value = X;
			next = null;
		}
	}
	
	

	
	
	
	
	
	

