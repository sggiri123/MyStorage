package Primitive_Casting;

public class Implicit {

	public static void main(String[] args) {
		
		int x = 10;         //4 byte
		double y = (int)x;  //Memory size goes on increasing 
		                    //widening casting
		                    // No data loss // 8 byte
		
		System.out.println(x);
		System.out.println(y); 
		

	}

}
