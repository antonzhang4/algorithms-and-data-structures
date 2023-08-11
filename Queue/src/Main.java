public class Main {

	public static void main(String[] args) {
		QueueLinkedList queue = new QueueLinkedList();
		System.out.println(queue);
		queueImplementation(queue);
		
		System.out.println();
		System.out.println("Queue Stack:");
		//initialized array of size 1 with null as the first element
		QueueArray queueArray = new QueueArray();
		System.out.println(queueArray);
		queueArrayImplementation(queueArray);
	}
	
	public static void queueImplementation(QueueLinkedList queue) {
		queue.enqueue("Hello,");
		queue.enqueue("my");
		queue.enqueue("name");
		queue.enqueue("is");
		queue.enqueue("Anton");
		
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
	}
	
	public static void queueArrayImplementation(QueueArray queue) {
		queue.enqueue("Hello,");
		queue.enqueue("my");
		queue.enqueue("name");
		queue.enqueue("is");
		queue.enqueue("Anton");
		
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
	}
}
