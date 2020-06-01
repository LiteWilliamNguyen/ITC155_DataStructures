package itc155;

import java.util.Stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Assign7_stutterTest {

	@Test
	public void stutterTest1() {
		Stack<Integer> s = new Stack<Integer>();
		 s.add(9);
		 s.add(14);
		 s.add(1);
		 s.add(7);
		 s.add(3);
		 Assign7_stutter.stutter(s);
		 
		 Stack<Integer> expectedStack = new Stack<Integer>();
		 expectedStack.add(3);
		 expectedStack.add(3);
		 expectedStack.add(7);
		 expectedStack.add(7);
		 expectedStack.add(1);
		 expectedStack.add(1);
		 expectedStack.add(14);
		 expectedStack.add(14);
		 expectedStack.add(9);
		 expectedStack.add(9);
		 
		 Assertions.assertEquals(expectedStack, s);

	}

}
