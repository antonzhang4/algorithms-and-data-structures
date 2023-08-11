import java.util.Arrays;

public class QueueArray {
	private String[] queue;
	private int front = 0;
	private int rear = 0;
	
	public QueueArray() {
		queue = new String[1];
	}
	
	public boolean isEmpty() {
		return rear == 0;
	}
	
	public boolean isFull() {
		return rear == queue.length;
	}
	
	public void enqueue(String item) {
		if (isEmpty()) {
			queue = new String[1];
		}
		if (isFull()) {
			String[] temp = new String[rear*2];
			for (int i = 0; i<queue.length; i++) {
				temp[i] = queue[i];
			}
			queue = temp;
		}
		
		queue[rear] = item;
		rear++;
	}
	
	public String dequeue() {
		if (isEmpty()) {
			return null;
		}
		for(int i = 0; i < rear-1; i++) {
			queue[i] = queue[i+1];
		}
		String item = queue[rear-1];
		queue[rear-1] = null;
		rear--;
		if (queue.length/4 == rear) {
			String[] temp = new String[rear*2];
			for(int i = 0; i<temp.length; i++) {
				temp[i] = queue[i];
			}
			queue = temp;
		}
		return item;
	}
	
	public String toString() {
		return Arrays.toString(queue);
	}
}
