// ex3. Write a method called removeEvenLength that takes an ArrayList of strings as a parameter 
//and removes all of the strings of even length from the list


package itc155;

import java.util.ArrayList;

public class Ex3_removeEvenLength {
	public static void removeEvenLength(ArrayList<String> arr) {
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).length() % 2 == 0) {
				arr.remove(i);
				i--;
			}
		}
	}

	public static void main (String[] args) {
		ArrayList<String> ex1 = new ArrayList<>();
		
		ex1.add("test");
		ex1.add("is");
		ex1.add("working");
		ex1.add("?");
		ex1.add("num");
		ex1.add("number");
		
		removeEvenLength(ex1);
		
        System.out.println(ex1);
		
	}
}
