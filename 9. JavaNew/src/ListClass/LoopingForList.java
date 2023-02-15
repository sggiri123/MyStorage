package ListClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LoopingForList {

	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<>();
		
		list.add(10);
		list.add("Velocity");
		list.add('#');
		list.add(true);
		list.add(20.123f);
		list.add('#');

		
//		for(int i=(list.size()-1); i>=0; i--) {
//			System.out.println(list.get(i));
//		}
//		
//		System.out.println("==============================");
//		
//		for(Object k:list) {
//			System.out.println(k);
//		}
//		System.out.println("==============================");
		
		ListIterator<Object> p = list.listIterator();
		
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		
		System.out.println("===========================");
		
		while(p.hasPrevious()) {
			System.out.println(p.previous());
		}

	}

}
