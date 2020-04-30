//5th Ed of textbook Ch 11 p. 759, ex. 13 
//Be sure to write a test method as well. +10 extra credit points for a jUnit test (if you do, title the file jtestisunique, so I can easily spot it)
//wirte a method isUnique that accepts a map whose key and values are strings as parameter and returns true if no two keys map to the same value
//(and false if any two or more keys do map to the same value). for example, if the map contains the following key/value pairs,
//your method would return true: {Marty=Stepp, Stuart=Reges, Jessica=Miller,Amanda=camp, Hal=Perkins}. but calling it on the following map
//would return false, because of two mappings for Perkins and Rees : {Kenderick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}.


package itc155;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class isUnique {
	public static boolean isUnique(Map<String, String> map) {
	    Set<String> set = new HashSet<String>();

	    for(String key : map.keySet()) {
	        String val = map.get(key);
	        if(set.contains(val)) {
	        	return false;
	        }
	        set.add(val);
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		
		Map<String,String> ex1 = new HashMap<String,String>();
		
		//true case 
		ex1.put("Marty","Stepp");
		ex1.put("Jessica","Miller");
		ex1.put("Amanda","camp");
		ex1.put("Hal","Perkins");
		
		//false case 
//		ex1.put("Kenderick","Perkins");
//		ex1.put("Stuart","Reges");
//		ex1.put("Jessica","Miller");
//		ex1.put("Bruce","Reges");
//		ex1.put("Hal","Perkins");
		
		boolean result = isUnique(ex1);
		System.out.println(result);
		}
}
