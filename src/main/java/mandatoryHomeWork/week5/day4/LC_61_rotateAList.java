package mandatoryHomeWork.week5.day4;

/* Pseudocode :
 * 1. first hold the heah
 * 2. using for loop find the tail
 * 	then assign the tail.next = head
 * 	and make the node before the tail.next = null then make that as tail
 * 3. run the loop K target times*/
public class LC_61_rotateAList {
	public static void main(String[] args) {
		// pos case

		SingleLL1 sll = new SingleLL1();
		sll.add("5");
		sll.add("23");
		sll.add("7");
		sll.add("13");
		sll.add("40");
		sll.add("50");
		int target = 4;
		while (target > 0) {
			sll.rotate(sll);
			target--;
		}
		System.out.println("Pos case :"+sll);

		// edge
		SingleLL1 sll1 = new SingleLL1();
		sll1.add(null);
		int target1 = 1;
		while (target1 > 0) {
			sll1.rotate(sll1);
			target1--;
		}
		System.out.println("Edge case :" +sll1);

		// neg

		SingleLL1 sll2 = new SingleLL1();
		sll2.add("5");
		int target2 = 1;
		while (target2 > 0) {
			sll2.rotate(sll2);
			target1--;
		}
		System.out.println("Neg case :"+sll2);
	}
}

class SingleLL1 {
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

	SingleLL1 rotate(SingleLL1 sll) {
		int bforeTail = size - 1;
		Node bfrTail;
		Node current = start;
		Node tail;

		if (current.data == null) {
			System.out.println("The input is empty");
			return sll;
		}
		else {
		while (current.next != null) {
			current = current.next;
		}
		tail = current;
		tail.next = start;
		start = tail;
		// System.out.println(start.data);
		Node curr = start;
		for (int i = 0; i < bforeTail; i++) {
			curr = curr.next;
		}
		bfrTail = curr;
		bfrTail.next = null;
		// System.out.println(bfrTail.data);
		return sll;
		}
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
