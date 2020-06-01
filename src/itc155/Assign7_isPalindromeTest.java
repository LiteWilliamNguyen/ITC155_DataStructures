package itc155;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Assign7_isPalindromeTest {

	@Test
	public void palindromeTest1() {
		Queue<Integer> q = new LinkedList<Integer>();
		  q.add(3);
		  q.add(8);
		  q.add(17);
		  q.add(9);
		  q.add(17);
		  q.add(8);
		  q.add(3);
		 
		 Assertions.assertTrue(Assign7_isPalindrome.isPalindrome(q));

	}

}
