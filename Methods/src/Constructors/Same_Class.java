package Constructors;
public class Same_Class {
	int a;
	String s;
	public static void addition() 
	{
		Same_Class c = new Same_Class();
		System.out.println(c.a+" " +c.s);
	}	
	public void Display () 
	{
		int a = 20;
		int b = 30;
		int sum = a+b;
		System.out.println("The sum is: "+sum);
		System.out.println(a);
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		Same_Class c = new Same_Class();   //Constructor provided by compiler at the time of compilation
		c.Display(); 
		addition();
	}	
	public Same_Class()  //user defined constructor, used to initialize variable a.
	{     
		a = 20;  
		s = "Shridhar";
	}
}