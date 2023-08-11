import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		int[] path = new int[countNodes(root)];
		BFS(root, path);
		System.out.println("Path: " + Arrays.toString(path));
	}
	
	public static void BFS(Node root, int[] path) {
		if (root == null)
			return;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		int index = 0;
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			path[index] = node.item;
			index++;
			
			if (node.left!=null) {
				queue.add(node.left);
			}
			if (node.right!=null) {
				queue.add(node.right);
			}
		}
	}
	
	public static int countNodes(Node root) {
		if (root==null)
			return 0;
		return countNodes(root.left) + countNodes(root.right) + 1;
	}
}

class Node {
	int item;
	Node left, right;
	
	public Node(int item) {
		this.item = item;
		left = right = null;
	}
}
