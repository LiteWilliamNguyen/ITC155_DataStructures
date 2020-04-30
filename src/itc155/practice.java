package itc155;

import java.util.ArrayList;

public class practice {
	public static void Mystery(ArrayList<Integer> list) {
	    
		for(int i = list.size() -1; i >0; i--) {
			if(list.get(i) < list.get(i-1)) {
				int element = list.get(i);
				list.remove(i);
				list.add(0,element);
			}
		}
		System.out.print(list);
	}
	
	public static void main (String[] args) {
		ArrayList<Integer> ex1 = new ArrayList<>();
		
		ex1.add(-4);
		ex1.add(16);
		ex1.add(9);
		ex1.add(1);
		ex1.add(64);
		ex1.add(25);
		ex1.add(36);
		ex1.add(4);
		ex1.add(49);
		Mystery(ex1);
		
        System.out.println(ex1);
		
	}
}
