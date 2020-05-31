//p. 925 ex. 2 Write a method called stutter.....
//Write a method called stutter that accpets a stack of integers as a parameters as a parameter and replaces every value in the stack 
//with two occurrences of that value. Preserve the original relative order. For example, if the stack store [3,7,1,14,9], your method 
//should change it to store [3,3,7,7,1,1,14,14,9,9]. Use a single queue as auxiliary storage.

//Add tests to your methods (20 points)

package itc155;
import java.util.*;

public class Assign7_stutter {
	public static void main(String[] args) {
		  Stack<Integer> s = new Stack<Integer>();
		  s.add(9);
		  s.add(14);
		  s.add(1);
		  s.add(7);
		  s.add(3);
		  stutter(s);  
	}

	public static void stutter(Stack<Integer> s){
		Queue<Integer> q = new LinkedList<Integer>();
	    while(!s.isEmpty()) {
	      int n = s.pop();
	      q.add(n);
	      q.add(n);
	    }
	    while(!q.isEmpty()){
	      s.push(q.remove());
	    }
	    System.out.println(s);
	  }
}




