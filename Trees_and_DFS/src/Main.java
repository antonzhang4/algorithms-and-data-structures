import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = treeConstruction();
		System.out.println(root.item + ", " + root.left.item + ", " + root.right.item);
		
		//show the path of each iteration of recursion. Use traverse function
		int[] path = new int[1];
		int n = 0;
		path = traverse(root, path, n);
		System.out.println("path: " + Arrays.toString(path));
		
		//Show full list
		int[] fullPath = traverseFullPath(root);
		System.out.println("fullpath: " + Arrays.toString(fullPath));
		//multiple paths uses variable to store index whereas single full path uses arrays 
	}
	
	public static boolean isFull(int[] path, int n) {
		return n==path.length;
	}
	
	public static int[] traverse(Node curr, int[] path, int n) {
		if (curr == null)
			return path;
		path[n] = curr.item;
		n++;
		System.out.println("path: " + Arrays.toString(path));
		
		if (isFull(path, n)) {
			int[] temp = new int[n+1];
			for(int i = 0; i<path.length; i++) {
				temp[i] = path[i];
			}
			path = temp;
		}
		traverse(curr.left, path, n);
		traverse(curr.right, path, n);
		return path;
	}	
	
	public static int countNodes(Node root) {
		if (root == null)
			return 0;
		return countNodes(root.left) + countNodes(root.right) + 1;
	}
	
	public static int[] traverseFullPath(Node root) {
		int length = countNodes(root);
		int[] path = new int[length];
		int[] currentIndex = {0}; //pass as an array reference instead of variable so that currentIndex is incrementable across methods
		traverseFullPathHelper(root, path, currentIndex);
		return path;
	}
	
	public static void traverseFullPathHelper(Node root, int[] path, int[] currentIndex) {
		if (root==null) return;
		path[currentIndex[0]] = root.item;
		currentIndex[0]++;
		traverseFullPathHelper(root.left, path, currentIndex);
		traverseFullPathHelper(root.right, path, currentIndex);
		return;
	}
	
	public static Node treeConstruction() {
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        return root;
	}
}

class Node {
    int item;
    Node left, right;
 
    public Node(int item)
    {
        this.item = item;
        left = right = null;
    }
}