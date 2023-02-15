package Multilevel_Inheritence;

public class Class_A {
	
	public void multiplication () {
		int x= 20;
		int y= 30;
		int product = x*y ;
		System.out.println("The multilplication is :" + product);
	}

	public static void main(String[] args) {
       		
         Class_A b = new Class_A();
         b.multiplication();
         
         
	}

}
