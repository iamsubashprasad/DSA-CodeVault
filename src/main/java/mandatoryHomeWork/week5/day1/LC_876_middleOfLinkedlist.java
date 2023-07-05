package mandatoryHomeWork.week5.day1;
/* 
 * Pseudocode :
 * 1. divide the size by 2
 * 2. then only itererate loop untill the quotiont
 * 3. inside the loop move the pointer to current.next 
 * 4. then print the value*/

public class MdlOfLL {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLL sll = new SingleLL();
		sll.add("5");
		sll.add("23");
		sll.add("7");
		sll.add("13");
		sll.add("40");
		sll.add("50");
		sll.mindPrnt(sll);
		System.out.println(sll);
	}
}

class SingleLL {
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

	SingleLL mindPrnt(SingleLL sll) {
		int mid = size / 2;
		Node current = start;

		for (int i = 0; i < mid; i++) {
			current = current.next;
			start = current;
			// System.out.println(current.data);
		}
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
