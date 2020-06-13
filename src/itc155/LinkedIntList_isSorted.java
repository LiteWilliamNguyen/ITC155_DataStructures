//5th Ed of textbook Ch 16  p. 1023 ex. 3 Write a method called isSorted  (80 points)
//Add tests to your methods (20 points)

//Write the method called isSorted that returns true if the list is in sorted (nondecreasing) order and return false otherwise.
//An empty list is considered to be sorted


package itc155;

class Node {
	int data;
	Node next; 
}

public class LinkedIntList_isSorted {
	Node head;
	 //add data
	 public void insert(int data) {
		 Node node = new Node();
		 node.data = data;
		 node.next = null;
		 
		 if(head == null) {
			 head = node;
		 } else {
			 Node n = head;
			 while(n.next != null) {
				 n = n.next;
			 }
			 n.next = node;
		 }
	 }
	 
	 //insert data at front 
	 public void insertAtStart(int data) {
		 Node node = new Node();
		 node.data = data;
		 node.next = null;
		 node.next = head;
		 
		 head = node;
	 }
	 
	 //insert data at specific index
	 public void insertAt (int index, int data) {
		 Node node = new Node();
		 node.data = data;
		 node.next = null; 
		 
		 if(index == 0) { //when insert at 0 index
			 insertAtStart(data);
		 } else {
			 Node n = head;
			 for (int i =0; i <index-1; i++) {
				 n = n.next;
			 }
			 node.next = n.next;
			 n.next = node;
		 }
	 }
	 
	 //delete data at specific index 
	 public void deleteAt (int index) {
		 if (index == 0) {
			 head = head.next; 
		 } else {
			 Node n = head;
			 Node n1 = null;
			 for (int i =0; i <index-1; i++) {
				 n = n.next;
			 }
			 n1 = n.next;
			 n.next = n1.next; 
			 //System.out.println("n1 : " + n1.data); 
		 }
	 }
	 
	 
	 //print
	 public void show() {
		 Node node = head;
		 while (node.next != null) {
			 System.out.println(node.data);
			 node = node.next;
		 }
		 System.out.println(node.data); //print last node;
	 }

//YOUR CODE GOES HERE
 	public boolean isSorted() {
 		if(head == null) {
 			return true;
 		}
 		Node prev = head;
 		Node current = prev.next;
	 
	 while(current != null) {
		 if(prev.data > current.data) {
			 return false;
		 }
		 prev = current;
		 current = prev.next;
	 }
	 return true;
	 }
 	
 	
	public static void main(String[] args) {
		LinkedIntList_isSorted test = new LinkedIntList_isSorted();

		test.insert(10);
		test.insert(5);
		test.insert(30);
		test.insert(12);
		test.insert(20);
		test.insert(50);
		
		System.out.println("False Case: " + test.isSorted());

		
		LinkedIntList_isSorted test2 = new LinkedIntList_isSorted();

		test2.insert(5);
		test2.insert(7);
		test2.insert(10);
		test2.insert(15);
		test2.insert(20);
		test2.insert(38);
		
		System.out.println("True Case: " + test2.isSorted());
	}
}





