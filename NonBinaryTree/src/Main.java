import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    List<TreeNode> children;

    public TreeNode(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create nodes for the non-binary tree
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        // Connect nodes to form the tree
        root.addChild(node2);
        root.addChild(node3);
        node2.addChild(node4);
        node2.addChild(node5);
        node3.addChild(node6);
        node6.addChild(node7);

        // Perform any operations or traversals on the non-binary tree
        // For example, you can print the values in a depth-first manner
        System.out.println("Depth-First Traversal:");
        depthFirstTraversal(root);
    }

    public static void depthFirstTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        for (TreeNode child : root.children) {
            depthFirstTraversal(child);
        }
    }
}