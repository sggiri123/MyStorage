package Compile_Time;

public class Method_Overloading {
	
	void add()
	{
		int a = 10, b = 20, c;
		c=a+b ;
		System.out.println(c);
	}
	void add(int x, int y)
	{
	   int c;
		c=x+y ;
		System.out.println(c);
	}
	void add(int x, double y)
	{
		   double c;
			c=x+y ;
			System.out.println(c);
	}
	
	int add(int x, int y, int z)
	{
		int a = x, b = y, c=z;
		c=a+b+z ;
		return c;
	}
	public static void main(String[] args) 
	{
		Method_Overloading a = new Method_Overloading(); //reference type //dummy object type
		a.add(20, 30);
		a.add();
		a.add(10, 20.25);
		int f=a.add(10, 5, 6);
		System.out.println(f);
		

	}

}
