package itc155;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Final2Test {

	@Test
	public void consecutiveTest() {
		
		//success
		Final2 test1 = new Final2();
		
		test1.insert(3);
		test1.insert(4);
		test1.insert(7);
		test1.insert(8);
		test1.insert(10);
		
		Assertions.assertEquals(true, test1.hasTwoConsequitive());
		
		//fail --> should be true because 9 &10 are consecutive
		Final2 test2 = new Final2();
		
		test2.insert(3);
		test2.insert(5);
		test2.insert(1);
		test2.insert(9);
		test2.insert(10);
		
		Assertions.assertEquals(false, test2.hasTwoConsequitive());
		
	}

}
