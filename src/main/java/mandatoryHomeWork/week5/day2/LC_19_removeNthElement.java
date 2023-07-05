package mandatoryHomeWork.week5.day2;

/*1. fidn the total size then - the target  -> to reach the node before the target
 * 2. then assign the current.next.next to the next of that (node before the target of removal from the tail)
 *  */

public class LC_19_removeNthElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleL sll = new SingleL();
		sll.add("5");
		sll.add("23");
		sll.add("13");
		sll.add("40");
		sll.add("50");
		sll.add("70");
		sll.add("80");
		sll.add("90");
		int target = 2;
		System.out.println(sll.removeNthFromEnd(sll, target));
		
		SingleL sll2 = new SingleL();
		sll2.add("5");
		sll2.add("23");
		sll2.add("13");
		sll2.add("40");
		sll2.add("50");
		int target2 = 4;
		System.out.println(sll2.removeNthFromEnd(sll2, target2));
		
		SingleL sll3 = new SingleL();
		sll3.add("5");
		sll3.add("10");		
		int target3 = 1;
		System.out.println(sll3.removeNthFromEnd(sll3, target3));
	}
}

class SingleL {
	class Node {
		String data = null;
		Node next = null;
	}

	Node start = null;
	int size = 0;

	void add(String data) {

		Node node = new Node();
		node.data = data;

		if (start == null) {
			start = node;
		} else {
			Node current = start;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
		size++;
	}

	public SingleL removeNthFromEnd(SingleL sll, int target) {
		int remNode = size - target;
		Node current = start;
		//Node tail = start;
		System.out.println(size);
		/*
		 * while (tail.next != null) { tail = tail.next; }
		 */
		current = start;
		for (int i = 1; i < remNode; i++) {
			current = current.next;
		}
		current.next = current.next.next;
		return sll;

	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		Node current = start;
		while (current != null) {
			sb.append(current.data + ", ");
			current = current.next;
		}
		sb.append("] --> " + size);
		return sb.toString();
	}
}
