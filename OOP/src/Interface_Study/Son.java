package Interface_Study;

public class Son implements Father, Mother{
	
	public int addition()
	{
		int a = 5;
		int b = 10;
		int c= a+b;
		System.out.println("The sum is " +c);
		return c;
	}
	public void substraction ()
	{
		int x = 10;
		int y = 10;
		System.out.println("The substraction is " +(x-y));
	}
	public char multiplication ()
	{
		char c = 'a';
		char d = 'c';
		char f = (char) (c*d);
		System.out.println("c*d");
		return f;
	}
    public void division() 
	{
		int x = 10;
		int y = 2;
		System.out.println("The division is "+x/y);
	}
	public static void main(String[] args) {
		
		System.out.println(x+y);
		
		Son b = new Son();
		b.addition();
		b.substraction();
		b.multiplication();
		b.division();
		
		

	}

}
