//Write a void method selectionSortDescendTrace() that takes an integer array, and sorts the array into descending order. 
//The method should use nested loops and output the array after each iteration of the outer loop, thus outputting the array N-1 times 
//(where N is the size). Complete main() to read in a list of up to 10 positive integers (ending in -1) 
//and then call the selectionSortDescendTrace() method.

//input : 20 10 30 40 -1
//output: 
//	40 10 30 20 
//	40 30 10 20 
//	40 30 20 10 
	
package itc155;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrder {
// TODO: Write a void method selectionSortDescendTrace() that takes
	public static void selectionSortDescendTrace(int [] numbers, int numElements) {
		int max;
		// an integer array and the number of elements in the array as arguments, and sorts the array into descending order.
		for (int i = 0; i < numElements - 1; ++i) {
	    	 max = i;
	    	 for (int j = i + 1; j < numElements; ++j) {
	                if (numbers[j] > numbers[max]) {
	                	max = j;
	                }
	    	 }
	      	int temp = numbers[i];  
	      	numbers[i] = numbers[max];
	      	numbers[max] = temp;
	        
	      	for(int j = 0; j < numElements; j++) {
	      		System.out.print(numbers[j] + " ");
	      	}
	      	System.out.println();
	     }
	}
	
	public static void main(String[] args) {
		int numElements = 0;
		int [] numbers = new int[10];
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("input: ");		
	
// TODO: Read in a list of up to 10 positive integers; stop when -1 is read. Then call selectionSortDescendTrace() method.
		for (int i = 0; i< numbers.length; i++ ) {
			numbers[i] = scnr.nextInt();
			if(numbers[i] == -1) {
				break;
			}
			++numElements;
		}
		selectionSortDescendTrace(numbers, numElements);		
	}
}
