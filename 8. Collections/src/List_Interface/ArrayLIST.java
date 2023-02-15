package List_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLIST {

	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<>();
		
		
		list.add("Shridhar");
		list.add("is placed");
		list.add("in amazon");
		list.add(10);
		list.add(70);
		list.add(30);
		list.add(50);
		
		System.out.println(list.size());
		
//		for (int i = 0; i<list.size(); i++)
//		{
//			System.out.println(list.get(i));
//		}
//		list.set(6, 100);
//		System.out.println(list.get(6));
//		
//	    Collections.reverse(list);
//		
//	    for (Object k:list)
//	    {
//	    	System.out.println(k);
//	    }
	    
	    Iterator <Object> k = list.iterator();
	    while(k.hasNext())
	    {
	    	System.out.println(k.next());
	    }
	    
		

	}

}
