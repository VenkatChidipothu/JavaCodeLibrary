package BST;

public class BinaryTree {
	Node root;

	public BinaryTree() {
		root = null;
	}

	private Node addRecursive(Node current, int value) {
	    if (current == null) {
	        return new Node(value);
	    }
	 
	    if (value < current.value) {
	        current.left = addRecursive(current.left, value);
	    } else if (value > current.value) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        
	        return current;
	    }
	 
	    return current;
	}
	public void add(int value) {
	    root = addRecursive(root, value);
	}
	public void traverseInOrder(Node node) {
	    if (node != null) {
	        traverseInOrder(node.left);
	        System.out.print(" " + node.value);
	        traverseInOrder(node.right);
	    }
	}

}
