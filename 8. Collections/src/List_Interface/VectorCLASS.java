package List_Interface;

import java.util.ListIterator;
import java.util.Vector;

public class VectorCLASS {

	public static void main(String[] args) {
		
		Vector<Object> list = new Vector<>();
		
		list.add('@');
		list.add('#');
		list.add('%');
		list.add(7);
		list.add('*');
		
		ListIterator<Object> a = list.listIterator();
		while (a.hasNext())
		{
			System.out.println(a.next());
		}
		System.out.println("=======================");
		
		while (a.hasPrevious())
		{
			System.out.println(a.previous());
		}
	
}
}
