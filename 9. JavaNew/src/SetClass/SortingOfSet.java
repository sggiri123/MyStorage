package SetClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SortingOfSet {

	public static void main(String[] args) {
		
		HashSet<Integer> hSet = new HashSet<>();
		
		hSet.add(10);
		hSet.add(56);
		hSet.add(32);
		hSet.add(8);
		hSet.add(99);
		hSet.add(32);
		hSet.add(55);
		
		System.out.println(hSet);
		
		List<Integer> setToList = new ArrayList<>(hSet);
		
		Collections.sort(setToList);

		System.out.println(setToList);
	}

}
