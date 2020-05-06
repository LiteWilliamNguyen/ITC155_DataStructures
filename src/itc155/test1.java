//5th Ed of textbook Ch 12...Code a solution and a test for p. 831 ex. 2, Write a method called writeNums that takes an integer n…

//Test your method from the main

//write a method called writeNums that takes an integer n as a parameter and prints to the console the first n integers
//starting with 1 in sequential order, seperated by commas. For example, consider the following calls: 
//writeNums(5);   ===> output : 1,2,3,4,5
//writeNums(12);  ===> output : 1,2,3,4,5,6,7,8,9,10,11,12

package itc155;

public class test1 {
	public static void writeNums(int n) {		
		if(n == 1) {
			System.out.print("1");
		} else {
			writeNums(n - 1);
			System.out.print(", " + n);
		}
	}
	
	public static void main(String[] args) {
		writeNums(5);
		System.out.println();
		writeNums(12);
		System.out.println();
		writeNums(20);
		
	}
}
