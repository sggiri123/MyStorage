package Calling_methods;

public class Another_Class {

	public static void main(String[] args) {
		
		Same_Class.method();
		
		Same_Class a = new Same_Class();
		a.substraction();
		a.Student_Name("Mangesh", "Giri");   //Parameters are specified in method
	    
		Same_Class.Shridhar(8, 9);
	}

}
