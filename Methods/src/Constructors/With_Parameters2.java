package Constructors;

public class With_Parameters2 {
	
		// example for user defined constructor with parameters
		int num1;
		int num2;
		int num3;
		
		public With_Parameters2() // user defined without parameters
		{
			num1=10;
			num2=20;
			num3=30;
		}
		
		public With_Parameters2(int a)// user defined with single parameter constructor 
		{
		num1=a;	
		}
		
		public With_Parameters2(int a, int b)// user defined with two parameter constructor
		{
			num1=a;
			num2=b;
			
		}
		
		public With_Parameters2(int a, int b, int c)
		{
			num1=a;
			num2=b;
			num3=c;
			
		}
		
		public static void main(String[] args) 
		{
			With_Parameters2 c1= new With_Parameters2();// object created with default value zero
			c1.addition();
			
			With_Parameters2 c2= new With_Parameters2(100);// object created with some default vaule
			c2.addition();
			
			With_Parameters2 c3= new With_Parameters2(80, 90);
			c3.addition();
			
			With_Parameters2 c4= new With_Parameters2(70, 80, 90);
			c4.addition();

		}

		public void addition()// non static method
		{
			int sum= num1+num2+num3;
			System.out.println("Addition is "+sum);
		}
		
	}
	
