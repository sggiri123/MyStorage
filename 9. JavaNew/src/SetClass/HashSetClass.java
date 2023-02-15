package SetClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetClass {

	public static void main(String[] args) {
		
		HashSet<Object> hSet = new HashSet<>();
		
		hSet.add("Velocity");
		hSet.add(10);
		hSet.add("is");
		hSet.add(20);
		hSet.add("in");
		hSet.add(30);
		hSet.add("Katraj");
		hSet.add(40);
		
		System.out.println(hSet);
		
		
		
		
		
		//Converting set into list
		List<Object> setToList = new ArrayList<>(hSet);
		
		System.out.println(setToList.get(2));
		
		
		for(Object k:hSet) {
			
			if(k.equals("Katraj")) {
				System.out.println(k);
			}
		}
		

	}

}
