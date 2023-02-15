package Same_Package;

public class Non_Child_Class {

	public static void main(String[] args) {
		
		Same_Class a = new Same_Class();
		//Same_Class.additon();  //private method can not be accessed outside class.
		a.substraction();        
		a.multiply();
		Same_Class.divide();

	}

}
