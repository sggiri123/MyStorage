package SetClass;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

public class LinkecHasSetClass {

	public static void main(String[] args) {
		
		
		LinkedHashSet<Object> hSet = new LinkedHashSet<>();
		
		hSet.add("Velocity");
		hSet.add(10);
		hSet.add("is");
		hSet.add(20);
		hSet.add("in");
		hSet.add(30);
		hSet.add("Katraj");
		hSet.add(40);
		
		System.out.println(hSet);
		List<Object> setToList = new ArrayList<>(hSet);
		
		ListIterator<Object> k = setToList.listIterator();
		
		while(k.hasNext()) {
			System.out.println(k.next());
		}
		
		System.out.println("==================================");
		
		while(k.hasPrevious()) {
			System.out.println(k.previous());
		}
		
	}

}
