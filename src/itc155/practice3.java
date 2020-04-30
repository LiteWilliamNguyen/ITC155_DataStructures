package itc155;

import java.util.ArrayList;

public class practice3 {
	public static void Mystery(ArrayList<Integer> list) {
	    
		for(int i = 0; i < list.size(); i++) {
			int element = list.get(i);
			list.remove(i);
 			list.add(0, element + 1);
		}
		System.out.print(list);
	}
	
	public static void main (String[] args) {
		ArrayList<Integer> ex1 = new ArrayList<>();
		
//		ex1.add(10);
//		ex1.add(20);
//		ex1.add(30);

//		ex1.add(8);
//		ex1.add(2);
//		ex1.add(9);
//		ex1.add(7);
//		ex1.add(4);
		
		ex1.add(-1);
		ex1.add(3);
		ex1.add(28);
		ex1.add(17);
		ex1.add(9);
		ex1.add(33);
		Mystery(ex1);
		
	}
}
