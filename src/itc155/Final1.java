//Ch 14 Stacks & Queues  p. 925 ex. 5 Write a method equals....  50 points (40 code + 10 test)
//Write a method called equals that accepts two stacks of integer as parameter and returns true if the two stacks store exactly the same sequence 
//of integer value in the same order. Your method must restore the two stacks to their original state before returning. 
//Use one stack as auxiliary storage.

package itc155;

import java.util.Stack;

public class Final1 {

	public static void main(String[] args) {
		//true case
		Stack<Integer> num1 = new Stack<Integer>();
			num1.push(3);
			num1.push(6);
			num1.push(8);
			num1.push(22);
		  
		Stack<Integer> num2 = new Stack<Integer>();
			num2.push(3);
			num2.push(6);
			num2.push(8);
			num2.push(22);
			
		System.out.println(equals(num1,num2)); 
		
		
//		false case
		Stack<Integer> num3 = new Stack<Integer>();
			num3.push(11);
			num3.push(22);
			num3.push(33);
			num3.push(44);
		  
		Stack<Integer> num4 = new Stack<Integer>();
			num4.push(11);
			num4.push(23);
			num4.push(34);
			num4.push(45);
		
		System.out.println(equals(num3,num4)); 
	}
	
	public static boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
	            
	    if(s1.size() != s2.size()) {
	    	return false;
	    }
	                            
	    Stack<Integer> s3 = new Stack<Integer>();
	    boolean areEqual = true;
	                                        
	    while(!s1.isEmpty()) {
	        int n1 = s1.pop();
	        int n2 = s2.pop();
	        s3.push(n1);
	        s3.push(n2);
	        
	        if(n1 != n2) {
	            areEqual = false;
	            break;
	        }
	    }
	    
	    while(!s3.isEmpty()) {
	        s2.push(s3.pop());
	        s1.push(s3.pop());
	    }
	    
	    return areEqual;
	}

}
