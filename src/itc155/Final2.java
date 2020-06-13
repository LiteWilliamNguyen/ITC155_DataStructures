//Ch 16 LinkedList  p. 1024 ex. 6 Write a method called hasTwoConsequitive...  50 points (40 code + 10 test)
//Write a method called hasTwoConsecutive that returns whether or not a list of integer has two adjacent numbers that are consecutive integer
//(true if such a pair exist and false otherwise). For example, if a variable list stores the value [1,18,2,7,8,39,18,40], then the call
//list.hasTwoConsecutive() should return true because the list contains the adjacent number(7,8), which are a pair of consecutive numbers.

package itc155;

import java.util.LinkedList;

class Node1 {
	int data;
	Node next;  
}

class Final2 {
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
	 
	 
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		
		list1.insert(2);
		list1.insert(3);
		list1.insert(6);
		list1.insert(9);
		list1.insert(11);
		
		list1.show();
		
	}

}





