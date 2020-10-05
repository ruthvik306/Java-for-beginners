class Tree { 
	int data; 
	Tree left, right; 
	public Tree(int item) { 
		data = item; 
		left = right = null; 
	} 
} 

class BinaryTree { 
	Tree root; 
	public BinaryTree() { 
		root = null; 
	} 

	void printLevelOrder() { 
		int h = height(root); 
		int i; 
		for (i=1; i<=h; i++) 
			printGivenLevel(root, i); 
	} 

	int height(Tree root) { 
		if (root == null) 
		return 0; 
		else
		{ 
			/* compute height of each subtree */
			int lheight = height(root.left); 
			int rheight = height(root.right); 
			if (lheight > rheight) 
				return(lheight+1); 
			else return(rheight+1); 
		} 
	} 

	/* Print nodes at the given level */
	void printGivenLevel (Tree root ,int level) { 
		if (root == null) 
			return; 
		if (level == 1) 
			System.out.print(root.data + " "); 
		else if (level > 1) 
		{ 
			printGivenLevel(root.left, level-1); 
			printGivenLevel(root.right, level-1); 
		} 
	} 
	
	public static void main(String args[]) { 
        BinaryTree tree = new BinaryTree(); 
        tree.root= new Tree(1); 
        tree.root.left= new Tree(2); 
        tree.root.right= new Tree(3); 
        tree.root.left.left= new Tree(4); 
        tree.root.left.right= new Tree(5); 
            
        System.out.println("Level order traversal of binary tree is: "); 
        tree.printLevelOrder(); 
	} 
} 
