package Set_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSET {

	public static void main(String[] args) {
		
		HashSet <Object> a = new HashSet<>();
		
		a.add("Shridhar");
		a.add("Shridhar");       //do not allow duplicate values.
		a.add("");
		a.add("");               //allows only one null value. 
		a.add("Giri");
		a.add(10);
		
		System.out.println(a);  //insertion order is not maintained in HashSet. 
		
		ArrayList<Object> list = new ArrayList<>(a);  //converting HashSet into ArrayList.
		Collections.reverse(list);
		System.out.println(list);

	}

}
