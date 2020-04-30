package itc155;

import java.util.ArrayList;

public class practice4 {
	public static void Mystery(ArrayList<Integer> list) {
	    
		for(int i = list.size() -2; i > 0; i--) {
			int a = list.get(i);
			int b = list.get(i + 1);
			list.set(i, a + b);
		}
		System.out.print(list);
	}
	
	public static void main (String[] args) {
		ArrayList<Integer> ex1 = new ArrayList<>();
//		
//		ex1.add(72);
//		ex1.add(20);

//		ex1.add(1);
//		ex1.add(2);
//		ex1.add(3);
//		ex1.add(4);
//		ex1.add(5);
//		ex1.add(6);
		
		ex1.add(10);
		ex1.add(20);
		ex1.add(30);
		ex1.add(40);

		Mystery(ex1);
		
	}
}
