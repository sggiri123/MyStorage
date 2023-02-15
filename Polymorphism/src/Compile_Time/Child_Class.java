package Compile_Time;

public class Child_Class extends Method_Hiding {
	
	static void add()
	{
		int a = 15, b = 20, c;
		c=a+b ;
		System.out.println(c);
	}
	static void add(int x, int y)
	{
	   x = 10; y =5; 
	   int c;
		c=x+y ;
		System.out.println(c);
	}
	static void add(int x, double y)
	{
		   double c;
			c=x+y ;
			System.out.println(c);
	}
	
	static int add(int x, int y, int z)
	{
		int a = x, b = y, c=z;
		c=a+b+z ;
		return c;
	}

	public static void main(String[] args) 
	{
		add();
		add(2,3);
		int z =add(2,3,5);
		System.out.println(z);
		add(5,6.25);
	}

}
