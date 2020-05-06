package itc155;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class jtestisunique {
	
	@Test
	public void trueCase() {
		Map<String,String> tcase = new HashMap<String,String>();
		tcase.put("Marty","Stepp");
		tcase.put("Jessica","Miller");
		tcase.put("Amanda","camp");
		tcase.put("Hal","Perkins");
		
//		boolean result = isUnique(tcase);
//		assertTrue("True", result);
        
	}
	
	@Test
	public void falseCase() {

	}
}
