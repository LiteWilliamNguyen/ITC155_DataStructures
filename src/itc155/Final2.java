//Ch 16 LinkedList  p. 1024 ex. 6 Write a method called hasTwoConsequitive...  50 points (40 code + 10 test)
//Write a method called hasTwoConsecutive that returns whether or not a list of integer has two adjacent numbers that are consecutive integer
//(true if such a pair exist and false otherwise). For example, if a variable list stores the value [1,18,2,7,8,39,18,40], then the call
//list.hasTwoConsecutive() should return true because the list contains the adjacent number(7,8), which are a pair of consecutive numbers.

package itc155;

class ListNode {
	int data;
	ListNode next;  
}

public class Final2 {
	ListNode head;
	 
	 //add data
	 public void insert(int data) {
		 ListNode node = new ListNode();
		 node.data = data;
		 node.next = null;
		 
		 if(head == null) {
			 head = node;
		 } else {
			 ListNode n = head;
			 while(n.next != null) {
				 n = n.next;
			 }
			 n.next = node;
		 }
	 }
	 
	 //insert data at first index 
	 public void insertAtStart(int data) {
		 ListNode node = new ListNode();
		 node.data = data;
		 node.next = null;
		 node.next = head;
		 
		 head = node;
	 }
	 
	 //insert data at specific index
	 public void insertAt (int index, int data) {
		 ListNode node = new ListNode();
		 node.data = data;
		 node.next = null; 
		 
		 if(index == 0) { //when insert at 0 index
			 insertAtStart(data);
		 } else {
			 ListNode n = head;
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
			 ListNode n = head;
			 ListNode n1 = null;
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
		 ListNode node = head;
		 while (node.next != null) {
			 System.out.println(node.data);
			 node = node.next;
		 }
		 System.out.println(node.data); //print last node;
	 }
	 
	//YOUR CODE GOES HERE
	 public boolean hasTwoConsequitive() {
		 if(head == null) {
			 return false;
		 }
		 ListNode prev = head;
		 ListNode current = prev.next;

		 while(current != null) {
			 if(prev.data + 1 == current.data) {
				 return true;
			 }
			 prev = current;
			 current = prev.next;
		 }
		 return false;
	 }
	 
	 
	public static void main(String[] args) {
		
		//true case 
		Final2 list1 = new Final2();
		
		list1.insert(2);
		list1.insert(3);
		list1.insert(6);
		list1.insert(9);
		list1.insert(11);
		
		System.out.println(list1.hasTwoConsequitive());
		
		//false case 
		Final2 list2 = new Final2();
		
		list2.insert(2);
		list2.insert(4);
		list2.insert(6);
		list2.insert(8);
		list2.insert(11);
		
		System.out.println(list2.hasTwoConsequitive());
	}

}





