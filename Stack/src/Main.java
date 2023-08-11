import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		System.out.println("Linked List Stack: ");
		StackLinkedList stacklinkedlist = new StackLinkedList();
		System.out.println(stacklinkedlist);
		linkedListImplementation(stacklinkedlist);
		
		System.out.println();
		System.out.println("Array Stack:");
		//initialized array of size 1 with null as the first element
		StackArray stackArray = new StackArray();
		System.out.println(stackArray);
		stackArrayImplementation(stackArray);
	}
	
	public static void linkedListImplementation(StackLinkedList stack) {
		stack.push("Hello,");
		stack.push("my");
		stack.push("name");
		stack.push("is");
		stack.push("Anton");
		
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
				
		stack.pop();
		System.out.println(stack);
				
		stack.pop();
		System.out.println(stack);
			
		stack.pop();
		System.out.println(stack);
				
		//Can't pop anymore. if empty, don't do anything
		stack.pop();
		System.out.println(stack);
	}
	
	public static void stackArrayImplementation(StackArray stack) {
		//Push onto stack. Null elements at end of array show the doubling/growth of the array when it is full
		stack.push("Hello,");
		stack.push("my");
		stack.push("name");
		stack.push("is");
		stack.push("Anton");
		
		System.out.println(stack);
		
		//Popping out of stack. Array halves in side when a quarter of the elements are filled
		stack.pop();
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
		//Can't pop anymore. if empty, don't do anything
		stack.pop();
		System.out.println(stack);
	}
}