package Set_Interface;

import java.util.TreeSet;

public class TreeSET {

	public static void main(String[] args) {
		
		TreeSet<String> tset= new TreeSet<>();
		tset.add("Pune");
		tset.add("Mumbai");
		tset.add("Delhi");
		tset.add("Kolkata");
		tset.add("Hyderabad");
		tset.add("Delhi");
		
//		tset.add(10);
//		tset.add(50);
//		tset.add(30);
		
		System.out.println(tset);  //Insertion order is not maintained in TreeSet. We get sorted data.
	}

}
