package itc155;

import java.util.ArrayList;

public class practice2 {
	public static void Mystery(ArrayList<Integer> list) {
	    
		for(int i = list.size() -1; i >=0; i--) {
			if(i%2 == 0) {
				list.add(list.get(i));
			} else {
				list.add(0, list.get(i));
			}
		}
		System.out.print(list);
	}
	
	public static void main (String[] args) {
		ArrayList<Integer> ex1 = new ArrayList<>();
		
		ex1.add(-1);
		ex1.add(3);
		ex1.add(28);
		ex1.add(17);
		ex1.add(9);
		ex1.add(33);
//		ex1.add(36);
//		ex1.add(4);
//		ex1.add(49);
		Mystery(ex1);
		
		
	}
}
