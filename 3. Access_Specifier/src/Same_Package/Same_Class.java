package Same_Package;

public class Same_Class {
	
	
	private static void addition()
	{
		int x = 10;
		int y = 15;
		System.out.println("The sum is : " + (x+y));
	}
	
	protected void substraction ()
	{
		int a = 15;
		int b = 2;
		System.out.println("The substraction is : " +(a-b));
	}
	
	void multiply ()
	{
		int x = 5;
		int y = 3;
		System.out.println("The multiplication is: " +(x*y));
	}
	 public static void divide()
	 {
		 int a = 20;
		 int b = 10;
		 System.out.println("The division is : " + (a/b));
	 }

	public static void main(String[] args) 
	{
		Same_Class a = new Same_Class();
		addition();
		a.substraction();
		a.multiply();
		divide();

	}

}
