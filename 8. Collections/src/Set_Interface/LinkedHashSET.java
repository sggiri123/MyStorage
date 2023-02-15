package Set_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSET {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhash = new LinkedHashSet<>();
		
		lhash.add("Pune");
		lhash.add("Mumbai");
		lhash.add("Delhi");
		lhash.add("Kolkata");
		lhash.add("Hyderabad");
		lhash.add("Delhi");
		
		System.out.println(lhash);   //Insertion order is maintained.
		
		ArrayList<String> list = new ArrayList<>(lhash);
		Collections.sort(list);
		System.out.println(list);
		
		

	}

}
