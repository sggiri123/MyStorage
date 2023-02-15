package ListClass;

import java.util.ArrayList;
import java.util.Collections;

public class SortingOfList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(45);
		list.add(9);
		list.add(8);
		list.add(78);
		list.add(564);
		
		System.out.println(list);
		
		Collections.reverse(list);
		
		System.out.println(list);
		
//		Collections.sort(list);
//
//		System.out.println(list);
//		
//		Collections.reverse(list);
//		
//		System.out.println(list);
	}

}
