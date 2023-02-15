package List_Interface;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLIST {

	public static void main(String[] args) {
	
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(85);
		list.add(96);
		list.add(50);
		list.add(245);
		list.add(50);
//		System.out.println(list.get(1));
		Collections.sort(list);
//		System.out.println(list);
//		System.out.println(list.get(1));
		list.add(6,60);
//		System.out.println(list);
	
//		for (Integer k:list)
//		{
//			System.out.println(k);
//		}
		Iterator<Integer> p= list.iterator();
		while (p.hasNext())
		{
			System.out.println(p.next());
		}
		
	}

}
