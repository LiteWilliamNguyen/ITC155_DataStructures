//p. 888 ex. 4, 5 Complexity classes. Be sure to explain your reasoning for full credit. 
//Write the answers as comments on top of your java file where you solved the following problem. - 40 points
//Code a solution and a test for p. 890, ex 18 Write a modified version sort a selection sort algorithm - 60 points

package itc155;
public class Assign6 {

//*******************************************************************************************************************
//ex4. To which complexity class does the following algorithm belong? Consider N to be the length or size of the array or collection passed to 
//the method. explain your reasoning     

//Answer : O(N)
//Explain: This code is used O(N) because the time and size based on the result is affected by the input.
//However, even though result instance is set as double size of the list variable (2*list.length) ---2N, it returns data that is inside of the for loop. 
//the graph will grow linearly, and the constant can be omitted 
	public static int[] mystery1(int[] list) {
		int[] result = new int[2 * list.length];
		for (int i=0; i <list.length; i++) {
			result[2*i] = list[i] / 2 + list[i] %2;
			result[2*i+1] = list[i] /2;
		}
		return result;
	}

//*******************************************************************************************************************	
//ex5. To which complexity class does the following algorithm belong?
	
//Answer : O(N) (or probably O(log N)
//Explain: This code is used O(N) because the result graph will grow linearly. 
//but it could possibly be O(log N) since the size of data will be divided a half in the for loop (list.length /2) 
	public static void mystery2(int[] list) {  
		for(int i=0; i<list.length /2; i++) { 
			int j = list.length - 1 - i;
			int temp = list[i];
			list[i] = list[j]; 
  			list[j] = temp;
		}
	}

//*******************************************************************************************************************
// write a modified version of the selection sort algorithm that selects the largest element each time and moves it to the end of the array, rather
//than selecting the smallest element and moving it to the beginning. Will this algorithm be faster than the standard selection sort?
//what will its complexity class (big-Oh) be?

//Answer : O(N^2), selection sort is used 2 for loop to return the result. 
//its speed will be the same as standard selection sort, which is also O(N^2). 
	public static int[] modifiedSelectionSort(int[] list){
	     for (int i = 0; i < list.length - 1; i++) {
	    	 int max = i;
	    	 for (int j = i + 1; j < list.length; j++) {
	                if (list[j] < list[max]) {
	                	max = j;
	                }
	    	 }
	      	 int temp = list[i];  
	    	 list[i] = list[max];
	    	 list[max] = temp; 
	     }
	     return list;
	}
	
//Test
	public static void main(String[] args){
        int[] num = {10,5,33,52,47,7,81,55};
        int[] test = modifiedSelectionSort(num);
        for(int i : test){
            System.out.print(i + " ");
        }
    }
}