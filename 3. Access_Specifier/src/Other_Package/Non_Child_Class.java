package Other_Package;

import Same_Package.Same_Class;

public class Non_Child_Class {

	public static void main(String[] args) {
		
		Same_Class d  = new Same_Class();
		
		//Same_Class.additon();  //private method can not be accessed 
		//d.substraction();      //protected method can not be accessed in other package
		//d.multiply();          //default method can not be accessed in other package
        Same_Class.divide();
	}

}
