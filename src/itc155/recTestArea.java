package itc155;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class recTestArea {
	
	Rect r = new Rect();
	
	@Test
	void test() {
		assertEquals(3, r.recArea(1, 2));
		assertEquals(25, r.recArea(5, 5));
	}

}
