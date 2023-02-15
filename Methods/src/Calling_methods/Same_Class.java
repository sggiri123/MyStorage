package Calling_methods;

public class Same_Class {

		public static void method () 
		{
			int x = 5;
			int y = 6;
			System.out.println("The sum is : " + (x+y));
		}
		
		public void substraction ()
		{ 
			int x =10;
			int y = 5;
			System.out.println("The substraction is: " + (x-y));
		}

		public static void main(String[] args) 
		{
			method();
	       	    
			Same_Class a = new Same_Class();
			a.substraction();
			a.Student_Name(null, null);
			
			Shridhar(8,15);
	    
		}
		
		public static int Shridhar (int x, int y) 
		{
			int sum;
			sum = x+y;
			System.out.println("The sum of parameters is: " + sum);
			return sum;
		}
		
		public void Student_Name (String a, String b) 
		{

			System.out.println(a+ " " +b);		
		}
			

	}
