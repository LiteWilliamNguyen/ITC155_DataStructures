//5th Ed of textbook Ch 16  p. 1023 ex. 3 Write a method called isSorted  (80 points)
//Add tests to your methods (20 points)

//Write the method called isSorted that returns true if the list is in sorted (nondecreasing) order and return false otherwise.
//An empty list is considered to be sorted


package itc155;

import java.util.*;

//A LinkedIntList object can be used to store a list of integers.
public class LinkedIntList {
 private ListNode front;   // node holding first value in list (null if empty)
 private String name = "front";   // string to print for front of list
 
 // Constructs an empty list.
 public LinkedIntList() {
     front = null;
 }
 
 // Constructs a list containing the given elements.
 // For quick initialization via Practice-It test cases.
 public LinkedIntList(int... elements) {
     this("front", elements);
 }
 
 public LinkedIntList(String name, int... elements) {
     this.name = name;
     if (elements.length > 0) {
         front = new ListNode(elements[0]);
         ListNode current = front;
         for (int i = 1; i < elements.length; i++) {
             current.next = new ListNode(elements[i]);
             current = current.next;
         }
     }
 }
 
 // Constructs a list containing the given front node.
 // For quick initialization via Practice-It ListNode test cases.
 private LinkedIntList(String name, ListNode front) {
     this.name  = name;
     this.front = front;
 }
 
 // Appends the given value to the end of the list.
 public void add(int value) {
     if (front == null) {
         front = new ListNode(value, front);
     } else {
         ListNode current = front;
         while (current.next != null) {
             current = current.next;
         } 
         current.next = new ListNode(value);
     }
 }
 
 // Inserts the given value at the given index in the list.
 // Precondition: 0 <= index <= size
 public void add(int index, int value) {
     if (index == 0) {
         front = new ListNode(value, front);
     } else {
         ListNode current = front;
         for (int i = 0; i < index - 1; i++) {
             current = current.next;
         } 
         current.next = new ListNode(value, current.next);
     }
 }
 
 public boolean equals(Object o) {
     if (o instanceof LinkedIntList) {
         LinkedIntList other = (LinkedIntList) o;
         return toString().equals(other.toString());   // hackish
     } else {
         return false;
     }
 }
 
 // Returns the integer at the given index in the list.
 // Precondition: 0 <= index < size
 public int get(int index) {
     ListNode current = front;
     for (int i = 0; i < index; i++) {
         current = current.next;
     }
     return current.data;
 }
 
 // Removes the value at the given index from the list.
 // Precondition: 0 <= index < size
 public void remove(int index) {
     if (index == 0) {
         front = front.next;
     } else {
         ListNode current = front;
         for (int i = 0; i < index - 1; i++) {
             current = current.next;
         }
         current.next = current.next.next;
     }
 }
 
 // Returns the number of elements in the list.
 public int size() {
     int count = 0;
     ListNode current = front;
     while (current != null) {
         count++;
         current = current.next;
     }
     return count;
 }
 
 // Returns a text representation of the list, giving
 // indications as to the nodes and link structure of the list.
 // Detects student bugs where the student has inserted a cycle
 // into the list.
 public String toFormattedString() {
     ListNode.clearCycleData();
     
     String result = this.name;
     
     ListNode current = front;
     boolean cycle = false;
     while (current != null) {
         result += " -> [" + current.data + "]";
         if (current.cycle) {
             result += " (cycle!)";
             cycle = true;
             break;
         }
         current = current.__gotoNext();
     }

     if (!cycle) {
         result += " /";
     }
     
     return result;
 }
 
 // Returns a text representation of the list.
 public String toString() {
     return toFormattedString();
 }
 
 // Returns a shorter, more "java.util.LinkedList"-like text representation of the list.
 public String toStringShort() {
     ListNode.clearCycleData();
     
     String result = "[";
     
     ListNode current = front;
     boolean cycle = false;
     while (current != null) {
         if (result.length() > 1) {
				result += ", ";
			}
         result += current.data;
         if (current.cycle) {
             result += " (cycle!)";
             cycle = true;
             break;
         }
         current = current.__gotoNext();
     }

     if (!cycle) {
         result += "]";
     }
     
     return result;
 }
 

 // ListNode is a class for storing a single node of a linked list.  This
 // node class is for a list of integer values.
 // Most of the icky code is related to the task of figuring out
 // if the student has accidentally created a cycle by pointing a later part of the list back to an earlier part.

 public static class ListNode {
     private static final List<ListNode> ALL_NODES = new ArrayList<ListNode>();
     
     public static void clearCycleData() {
         for (ListNode node : ALL_NODES) {
             node.visited = false;
             node.cycle = false;
         }
     }
     
     public int data;          // data stored in this node
     public ListNode next;     // link to next node in the list
     public boolean visited;   // has this node been seen yet?
     public boolean cycle;     // is there a cycle at this node?

     // post: constructs a node with data 0 and null link
     public ListNode() {
         this(0, null);
     }

     // post: constructs a node with given data and null link
     public ListNode(int data) {
         this(data, null);
     }

     // post: constructs a node with given data and given link
     public ListNode(int data, ListNode next) {
         ALL_NODES.add(this);
         this.data = data;
         this.next = next;
         this.visited = false;
         this.cycle = false;
     }
     
     public ListNode __gotoNext() {
         return __gotoNext(true);
     }
     
     public ListNode __gotoNext(boolean checkForCycle) {
         if (checkForCycle) {
             visited = true;
             
             if (next != null) {
                 if (next.visited) {
                     // throw new IllegalStateException("cycle detected in list");
                     next.cycle = true;
                 }
                 next.visited = true;
             }
         }
         return next;
     }
 }

//YOUR CODE GOES HERE
 
 	public boolean isSorted() {
 		if(front == null) {
 			return true;
 		}
 		ListNode prev = front;
 		ListNode current = prev.next;
	 
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
		LinkedIntList test = new LinkedIntList();

		test.add(10);
		test.add(5);
		test.add(30);
		test.add(12);
		test.add(20);
		test.add(50);
		
		System.out.println("False Case: " + test.isSorted());

		
		LinkedIntList test2 = new LinkedIntList();

		test2.add(5);
		test2.add(7);
		test2.add(10);
		test2.add(15);
		test2.add(20);
		test2.add(38);
		
		System.out.println("True Case: " + test2.isSorted());
	}
}





