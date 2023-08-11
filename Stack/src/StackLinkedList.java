import java.util.Arrays;

public class StackLinkedList {
	private Node first = null;
	private int length = 0;
	
	private class Node {
		String item;
		Node next;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void push(String item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		length++;
	}
	
	public String pop() {
		if (!isEmpty()) {
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
			result = curr.item + " -> " + result;
			curr = curr.next;
		}
		return result;
	}
}
