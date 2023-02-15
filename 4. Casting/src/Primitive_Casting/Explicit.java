package Primitive_Casting;

public class Explicit {

	public static void main(String[] args) {
		
		double x = 5.25879; // 8 byte
		int y = (int)x;  // Memory size goes on decreasing. //4 byte
		                 // Narrowing casting.
		                 // Data loss takes place.
		               
		
		System.out.println(x);
		System.out.println(y);
		
		// boolean casting:
			//Boolean casting is considered to be incompatible casting type, 
		    //because boolean data type is unique type of data type where information is already pre-declared inside it.
            //eg. true or false
	}

}
