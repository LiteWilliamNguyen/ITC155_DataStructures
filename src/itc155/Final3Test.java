package itc155;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Final3Test {

	@Test
	public void isFullTest() {
		
		//success
		Final3 test1 = new Final3(); 
		Final3Node testNode1 = null;
		
		testNode1 = test1.insert(testNode1, 2); 
		testNode1 = test1.insert(testNode1, 1); 
		testNode1 = test1.insert(testNode1, 5); 
		testNode1 = test1.insert(testNode1, 10);
		testNode1 = test1.insert(testNode1, 4); 
		
		Assertions.assertEquals(true, Final3.isFull(testNode1));
		
		//fail --> should be false because there's only one branch on 4 (left is null)
		Final3 test2 = new Final3(); 
		Final3Node testNode2 = null;
		
		testNode2 = test2.insert(testNode2, 2); 
		testNode2 = test2.insert(testNode2, 1); 
		testNode2 = test2.insert(testNode2, 5); 
		testNode2 = test2.insert(testNode2, 10);
		testNode2 = test2.insert(testNode2, 4); 
		testNode2 = test2.insert(testNode2, 8); 
		
		Assertions.assertEquals(true, Final3.isFull(testNode2));

	}

}
