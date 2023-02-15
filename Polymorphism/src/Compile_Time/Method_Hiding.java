package Compile_Time;

public class Method_Hiding {
	static void add()
	{
		int a = 10, b = 20, c;
		c=a+b ;
		System.out.println(c);
	}
	static void add(int x, int y)
	{
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
		int a = 3, b = 4, c=5;
		c=a+b+z ;
		return c;
	}

	public static void main(String[] args) {
		
		add();
		add(20,30);
		add(20,25.25);
		int y = add(3,3,5);
        System.out.println(y);
	}

}
