package Same_Package;

public class Child_Class extends Same_Class{

	public static void main(String[] args) {
	   Child_Class b = new Child_Class();
		// additon();    //Private method can not be accessed
	  
	   b.substraction(); //protected method can be accessed by inheritance.
	   b.multiply();     //default method can be accessed within the package.
	   
	   divide();         //public method can be accessed throughout the project.

	}

}
