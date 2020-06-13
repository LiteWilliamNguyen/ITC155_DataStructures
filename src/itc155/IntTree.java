//5th Ed of textbook Ch 17...Code a solution and a test for p. 1077 ex. 2, Write a method called countEmpty....

//Hint: Try a recursive solution.

//Write a method called countEmpty that returns the number of empty branches in a tree. An empty tree is considered to have one empty branch 
//(the tree itself). For nonempty trees, your methods should count the total number of empty branches among the nodes of tree. 
//A leaf node has two empty branches, a node with one nonempty child has one empty branch, and a node with two nonempty children has no empty branch.
//For example, reference tree #1 has 7 empty branches (two under the value1, one under 5, and two under each 4 and 6)

package itc155;

public class IntTree {
	private IntTreeNode root; 
	
	class IntTreeNode  { 
	    int data; 
	    IntTreeNode left, right;
	    
	  
	    public IntTreeNode(int item)  { 
	        data = item; 
	        left = null; 
	        right = null; 
	    } 
	} 
	    
	public void BinaryTree() {
		root = null;
	}
	
	public boolean lookup (int data) {
	 return (lookup(root, data));
	}
	
	private boolean lookup (IntTreeNode node, int data) {
		if (node==null) {
			return false;
		}
		if (data == node.data) {
			return true;
		}
		else if (data<node.data) {
			return (lookup(node.left, data));
		}
		 else {
			 return (lookup(node.right, data));
		 }
	}
	
	public void insert (int data) {
		root = insert(root, data);
	}
	
	private IntTreeNode insert(IntTreeNode node, int data) {
		if(node == null) {
			node = new IntTreeNode(data);
		} else {
			if (data <= node.data) {
				node.left = insert (node.left, data);
			} else {
				node.right = insert (node.right, data);
			}
		}
		return node;
	}
	
	
	public int countEmpty() {
		return countEmpty(root);
	}

	private static int countEmpty(IntTreeNode node){
		if(node == null) {
			return 1;
		}
		return countEmpty(node.left) + countEmpty(node.right);
	}
	
	public static void main(String args[]) {
		
			IntTreeNode tree = new IntTreeNode(10); 
			tree.root = new IntTreeNode(2); 
			tree.root.left = new IntTreeNode(7); 
			tree.root.right = new IntTreeNode(5); 
			tree.root.left.right = new IntTreeNode(6); 
			tree.root.left.right.left = new IntTreeNode(1); 
			tree.root.left.right.right = new IntTreeNode(11); 
			tree.root.right.right = new IntTreeNode(9); 
			tree.root.right.right.left = new IntTreeNode(4); 
	  
			countEmpty(tree);
	    }
	}
	