package Other_Package;

import Same_Package.Same_Class;

public class Child_Class extends Same_Class{

	public static void main(String[] args) {
		
		Child_Class c = new Child_Class();
		//addition(); //private method can not be accessed outside Same_Class.
		
		c.substraction();
		//c.multiply(); //default method can not be accessed in other package.
		
		divide();
		

	}

}
