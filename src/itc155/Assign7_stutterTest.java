package itc155;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.Test;

class Assign7_stutterTest {

	@Test
	public void stutterTest1() {
		Assign7_stutter test = new Assign7_stutter();
		Stack<Integer> s = new Stack<Integer>();
		 s.add(9);
		 s.add(14);
		 s.add(1);
		 s.add(7);
		 s.add(3);

//		 assertEquals("[3, 3, 7, 7, 1, 1, 14, 14, 9, 9]", s.toString()); 
	}

}
