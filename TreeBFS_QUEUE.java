import java.util.Queue; 
import java.util.LinkedList; 

/* Class to represent Tree node */
class Tree { 
	int data; 
	Tree left, right; 

	public Tree(int item) { 
		data = item; 
		left = null; 
		right = null; 
	} 
} 

/* Class to print Level Order Traversal */
class BinaryTree { 
	Tree root; 
	void printLevelOrder() 
	{ 
		Queue<Tree> queue = new LinkedList<Tree>(); 
		queue.add(root); 
		while (!queue.isEmpty()) 
		{ 
			Tree tempTree = queue.poll(); 
			System.out.print(tempTree.data + " "); 

			/*Enqueue left child */
			if (tempTree.left != null) { 
				queue.add(tempTree.left); 
			} 

			/*Enqueue right child */
			if (tempTree.right != null) { 
				queue.add(tempTree.right); 
			} 
		} 
	} 

	public static void main(String args[]) { 
		BinaryTree tree_level = new BinaryTree(); 
		tree_level.root = new Tree(1); 
		tree_level.root.left = new Tree(2); 
		tree_level.root.right = new Tree(3); 
		tree_level.root.left.left = new Tree(4); 
		tree_level.root.left.right = new Tree(5); 

		System.out.println("Level order traversal of binary tree is: "); 
		tree_level.printLevelOrder(); 
	} 
} 
