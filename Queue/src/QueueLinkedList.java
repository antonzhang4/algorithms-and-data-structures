
public class QueueLinkedList {
	private Node first;
	private Node last;
	private int length;
	
	private class Node {
		String item;
		Node next;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void enqueue(String item) {
		length++;
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if (isEmpty()) first = last;
		else oldlast.next = last;
	}
	
	public String dequeue() {
		if(!isEmpty()) {
			length--;
		}
		else
			return null;
		String item = first.item;
		first = first.next;
		return item;
	}
	
	public String toString() {
		String result = null;
		Node curr = first;
		System.out.println("Length: " + length);
		
		for (int i = 0; i < length; i++) {
			if (result != null)
				result = result + " -> " + curr.item;
			else
				result = curr.item;
			curr = curr.next;
		}
		if (!isEmpty())
			result = result + " -> null";
		return result;
	}
}
