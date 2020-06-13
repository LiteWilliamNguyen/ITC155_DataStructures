//Ch 17 Binary Trees p. 1077 ex.7 Write a method isFull... 50 points (40 code + 10 test)
//Write a method called isFull that returns true if a binary tree is full and false if it is not. A full binary tree is one in which every node
//has 0 or 2 children. For example, reference trees #1 and #2 is not full, but #3 is full. By definition, the empty tree is considered full.

package itc155;

class Final3Node  { 
    int data; 
    Final3Node left, right;
}

public class Final3 {
	public Final3Node createNode(int n) {
		Final3Node node = new Final3Node();
		node.data = n;
		node.left = null;
		node.right = null;
		return node;
	}
	
	//add tree data
	public Final3Node insert(Final3Node node, int value) {
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
	public Final3Node delete(Final3Node node, int value) {
		if (node == null) {
			return null;
		}
		
		if (value < node.data) {
			node.left = delete(node.left, value);
		} else if (value > node.data){
			node.right = delete(node.right, value);
		} else {
			if(node.left == null || node.right == null) {
				Final3Node temp= null;
				temp = node.left == null ? node.right : node.left; //if node.left is null(true), return node.right
				
				if(temp == null) {
					return null;
				} else {
					return temp ;
				}
			} else {
				Final3Node helper = helper(node);
				node.data = helper.data;
				node.right = delete(node.right, 4);
				return node;
			}
		}
		return node;
	}
	
	
	public Final3Node helper(Final3Node node) {
		if (node == null) {
			return null;
		}
		
		Final3Node temp = node.right;
		
		while(temp.left != null) {
			temp = temp.left;
		}
		
		return temp;
	}
	
	//check if the value exists   //	System.out.println(tree.isPresent(root, 5));
	public boolean isPresent(Final3Node node, int value) {
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
	
	//Code Here
	public static boolean isFull(Final3Node node) {
		if(node == null) {
			return true;
		}
	    if(node.left == null && node.right != null) {
	    	return false;
	    }
	        
	    if(node.left != null && node.right == null) {
	    	return false;
	    }
	        
	    return isFull(node.left) && isFull(node.right);
	}
	
	public static void main(String[] args) {
		Final3 tree = new Final3(); 
		Final3Node root = null;
		
		root = tree.insert(root, 2); 
		root = tree.insert(root, 1); 
		root = tree.insert(root, 5); 
		root = tree.insert(root, 10);
		root = tree.insert(root, 4); 

		System.out.println(isFull(root));
	}

}
