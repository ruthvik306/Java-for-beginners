class Tree { 
	int key; 
	Tree left, right; 
	public Tree(int item) { 
		key = item; 
		left = right = null; 
	} 
} 

class BinaryTree { 
	Tree root; 
	BinaryTree() { 
		root = null; 
	} 

	void printInorder(Tree node) { 
		if (node == null) 
			return; 
		printInorder(node.left); 
		System.out.print(node.key + " "); 
		printInorder(node.right); 
	} 

	public static void main(String[] args) { 
		BinaryTree tree = new BinaryTree(); 
		tree.root = new Tree(1); 
		tree.root.left = new Tree(2); 
		tree.root.right = new Tree(3); 
		tree.root.left.left = new Tree(4); 
		tree.root.left.right = new Tree(5); 

		System.out.println("Inorder traversal of binary tree is: "); 
		printInorder(root); 
	} 
} 
