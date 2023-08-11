import java.util.Arrays;

public class StackArray {
	private String[] stack = new String[1];
	private String item;
	private int n;
	
	public boolean isEmpty() {
		return n==0;
	}
	
	public boolean isFull() {
		return n==stack.length;
	}
	
	public void push(String item) {
		if (isEmpty()) {
			stack = new String[1];
		}
		if (isFull()) {
			String[] temp = new String[n*2];
			for(int i=0; i<stack.length;i++) {
				temp[i] = stack[i];
			}
			stack = temp;
		}
		stack[n] = item;
		n++;
	}
	
	public String pop() {
		if (isEmpty()) {
			return null;
		}
		String item = stack[n-1];
		stack[n-1] = null;
		n--;
		if(stack.length/4==n) {
			String[] temp = new String[n*2];
			for(int i=0; i<temp.length;i++) {
				temp[i] = stack[i];
			}
			stack = temp;
		}
		return item;
	}
	
	public String toString() {
		return Arrays.toString(stack);
	}
}
