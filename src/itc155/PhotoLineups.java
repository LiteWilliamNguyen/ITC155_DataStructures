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
		if (permList.size() == 0) {
			System.out.println(nameList);
		}
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> permList = new ArrayList<String>();
		String name;
		
		//get the nameList from scanner 
		System.out.print("input: ");
	    double username = scnr.nextInt();
	    
		System.out.println("output: " + permList);
		
		//if -1, stop making a namelist
		
	
	// TODO: Read in a list of names; stop when -1 is read. Then call recursive method.
		}
}



