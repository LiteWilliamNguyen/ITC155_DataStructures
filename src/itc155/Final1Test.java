package itc155;

import java.util.Stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Final1Test {

	@Test
	public void equalTest() {
		Stack<Integer> num1 = new Stack<Integer>();
		num1.add(24);
		num1.add(46);
		num1.add(89);
		num1.add(4);
		 
		Stack<Integer> num2 = new Stack<Integer>();
		num2.add(24);
		num2.add(46);
		num2.add(89);
		num2.add(4);
		 
		Assertions.assertEquals(true, Final1.equals(num1,num2));

	}


}
