//p.925 ex.8 Write a method called isPalindrome...
//Write a method called isPalindrome that accepts a queue of integers as a parameter and returns true if the numbers in the queue are 
//the same in reverse order. For example, if the queue store [3,8,17,9,17,8,3], your method should return true because this sequence is
//the same in reverse order. If the queue stores [3,17,9,4,17,3], your method would return false because this sequence is not the same 
//in reverse order (the 9 and 4 in the middle don't match). The empty queue should be considered a palindrome. Your method must restore
//the parameter queue to its original state before returning. Use one stack as auxiliary storage 

//Add tests to your methods (20 points)

package itc155;

import java.util.*;

public class Assign7_isPalindrome {
	public static void main(String[] args) {
		  Queue<Integer> q = new LinkedList();
		  //True case 
		  q.add(3);
		  q.add(8);
		  q.add(17);
		  q.add(9);
		  q.add(17);
		  q.add(8);
		  q.add(3);
		  System.out.println(isPalindrome(q));  
		  
		  //false case 
//		  q.add(3);
//		  q.add(8);
//		  q.add(17);
//		  q.add(9);
//		  q.add(22);
//		  q.add(17);
//		  q.add(8);
//		  q.add(3);
//		  System.out.println(isPalindrome(q));  
	}

	
	public static boolean isPalindrome(Queue<Integer> q){
		Stack<Integer> s = new Stack<Integer>();
		boolean palindrome = true;
		int size = q.size();
		
		for(int i = 0; i< size; i++){
			int n = q.remove();
			q.add(n);
			s.push(n);
			}
		
		for(int i=0; i< size; i++){
			int n1 = q.remove();
			int n2 = s.pop();
			if(n1 != n2){
				palindrome = false;
			}
			q.add(n1);
		}
		return palindrome;
	}
}   



//stack
//push(value) value onto top of stack
//pop() remove & return the value at top of stack
//peek() return the value at top of stack w/o removing

//queue
//add(value) add the value at the back of queue
//remove() remove & return the value at the front of queue
//peek() return the value at the front of queue w/o removing
