//5th Ed of textbook Ch 17...Code a solution and a test for p. 1077 ex. 2, Write a method called countEmpty....

//Hint: Try a recursive solution.

//Write a method called countEmpty that returns the number of empty branches in a tree. An empty tree is considered to have one empty branch 
//(the tree itself). For nonempty trees, your methods should count the total number of empty branches among the nodes of tree. 
//A leaf node has two empty branches, a node with one nonempty child has one empty branch, and a node with two nonempty children has no empty branch.
//For example, reference tree #1 has 7 empty branches (two under the value1, one under 5, and two under each 4 and 6)

package itc155;


class IntTreeNode  { 
    int data; 
    IntTreeNode left, right;
}

public class IntTree {
	public IntTreeNode createNode(int n) {
		IntTreeNode node = new IntTreeNode();
		node.data = n;
		node.left = null;
		node.right = null;
		return node;
	}
	
	//add tree data
	public IntTreeNode insert(IntTreeNode node, int value) {
		if(node == null) { //create node if node is null
			return createNode(value);
		}
		
		if (value < node.data) {
			node.left = insert(node.left, value);
		} else if (value > node.data){
			node.right = insert(node.right, value);
		}
		return node;
	}
	
	//delete tree data
	public IntTreeNode delete(IntTreeNode node, int value) {
		if (node == null) {
			return null;
		}
		
		if (value < node.data) {
			node.left = delete(node.left, value);
		} else if (value > node.data){
			node.right = delete(node.right, value);
		} else {
			if(node.left == null || node.right == null) {
				IntTreeNode temp= null;
				temp = node.left == null ? node.right : node.left; //if node.left is null(true), return node.right
				
				if(temp == null) {
					return null;
				} else {
					return temp ;
				}
			} else {
				IntTreeNode helper = helper(node);
				node.data = helper.data;
				node.right = delete(node.right, 4);
				return node;
			}
		}
		return node;
	}
	
	
	public IntTreeNode helper(IntTreeNode node) {
		if (node == null) {
			return null;
		}
		
		IntTreeNode temp = node.right;
		
		while(temp.left != null) {
			temp = temp.left;
		}
		
		return temp;
	}
	
	//check if the value exists   //	System.out.println(tree.isPresent(root, 5));
	public boolean isPresent(IntTreeNode node, int value) {
		if(node == null) {
			return false;
		}
		
		boolean isPresent = false;
		
		while (node != null) {
			if(value < node.data) {
				node = node.left;
			} else if (value > node.data) {
				node = node.right;
			} else {
				isPresent = true;
				break;
			}
		}
		return isPresent;
	}
	
	
//Code here

	public static int countEmpty(IntTreeNode node){
		if(node == null) {
			return 1;
		}
		return countEmpty(node.left) + countEmpty(node.right);
	}
	
	public static void main(String args[]) {
		
			IntTree tree = new IntTree(); 
			IntTreeNode root = null;
			
			root = tree.insert(root, 2); 
			root = tree.insert(root, 1); 
			root = tree.insert(root, 5); 
			root = tree.insert(root, 10);
			root = tree.insert(root, 4); 
			root = tree.insert(root, 8);
			 
			System.out.println("Number of empty branch is " + countEmpty(root));

	    }
	}
	