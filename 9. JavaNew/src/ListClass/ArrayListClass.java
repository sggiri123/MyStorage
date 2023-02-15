package ListClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		
		
		List<Object> list = new ArrayList<>();
		
		list.add(10);
		list.add("Velocity");
		list.add('#');
		list.add(true);
		list.add(20.123f);
		list.add('#');
		
		System.out.println(list);
		
		list.add(2, '@');
		
		System.out.println(list);
		
	//	list.clear();
		
		list.set(4, false);
		
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		System.out.println(list.size());
		
		list.remove(5);
	
	}

}
