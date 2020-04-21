// ex4. Write a method called doubleList that takes an ArrayList of string as a parameter and replaces every string with two of that same string.
// for example, if the list stores the values ['how', 'are', 'you?'] before the method is called, it should store the value ['how','how,'are','are],
// 'you?','you?'] after the method executing.

package itc155;

import java.util.ArrayList;

public class Ex4_doubleList {
	public static void doubleList(ArrayList<String> arr) {
	    
		for(int i = 0; i < arr.size(); i += 2) {
			String s = arr.get(i);
			arr.add(i + 1, s);
		}
	}
	
	public static void main (String[] args) {
		ArrayList<String> ex1 = new ArrayList<>();
		
		ex1.add("how");
		ex1.add("are");
		ex1.add("you?");
		doubleList(ex1);
		
        System.out.println(ex1);
		
	}
}
