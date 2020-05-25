//Write a program that lists all ways people can line up for a photo (all permutations of a list of Strings). 

//The program will read a list of one word names (until -1), and use a recursive method to create 
//and output all possible orderings of those names, one ordering per line.
//input :  Julia Lucas Mia -1
//output : 
//	Julia Lucas Mia 
//	Julia Mia Lucas
//	Lucas Julia Mia
//	Lucas Mia Julia
//	Mia Julia Lucas
//	Mia Lucas Julia

package itc155;
import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {
// TODO: Write method to create and output all permutations of the list of names.
	
	public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
		int size = nameList.size();
		if (size == 0) {
			System.out.println(permList);
		} else { //recursive case 
			for (int i = 0; i < size; i++) {
				  ArrayList<String> list1 = new ArrayList<String>(permList);
				  list1.add(nameList.get(i));
	              ArrayList<String> list2 = new ArrayList<String>(nameList);
	              list2.remove(i);
	              allPermutations(list1, list2);
			}	
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> permList = new ArrayList<String>();
		String name;
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("input: ");
		name = scnr.next();
		
// TODO: Read in a list of names; stop when -1 is read. Then call recursive method. if -1, stop making a namelist		
			
			while (!name.equals("-1")) {
				nameList.add(name);
				name = scnr.next();
				}
				allPermutations(permList, nameList);
	}
}



