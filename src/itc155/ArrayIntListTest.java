package itc155;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayIntListTest {

	@Test
	public void testAddAndGet1() {
	    ArrayIntList list = new ArrayIntList();
	    list.add(42);
	    list.add(-3);
	    list.add(17);
	    list.add(99);
	    assertEquals(42, list.get(0));
	    assertEquals(-3, list.get(1));
	    assertEquals(17, list.get(2));
	    assertEquals(99, list.get(3));

	    assertEquals("second attempt", 42, list.get(0));   // make sure I can get them a second time
	    assertEquals("second attempt", 99, list.get(3));
	}

	@Test
	public void testSize1() {
	    ArrayIntList list = new ArrayIntList();
	    assertEquals(0, list.size());
	    list.add(42);
	    assertEquals(1, list.size());
	    list.add(-3);
	    assertEquals(2, list.size());
	    list.add(17);
	    assertEquals(3, list.size());
	    list.add(99);
	    assertEquals(4, list.size());
	    assertEquals("second attempt", 4, list.size());   // make sure I can get it a second time
	}

	@Test
	public void testIsEmpty1() {
	    ArrayIntList list = new ArrayIntList();
	    assertTrue(list.isEmpty());
	    list.add(42);
	    assertFalse("should have one element", list.isEmpty());
	    list.add(-3);
	    assertFalse("should have two elements", list.isEmpty());
	}

	@Test
	public void testIsEmpty2() {
	    ArrayIntList list = new ArrayIntList();
	    list.add(42);
	    list.add(-3);
	    assertFalse("should have two elements", list.isEmpty());
	    list.remove(1);
	    list.remove(0);
	    assertTrue("after removing all elements", list.isEmpty());
	    list.add(42);
	    assertFalse("should have one element", list.isEmpty());
	}

}
