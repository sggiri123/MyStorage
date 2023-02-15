package Constructors;

public class With_Parameters {
	public With_Parameters (int a, int b, int c)
	{   int sum;
		sum = a+b+c;
		System.out.println(sum);
	}	
	public With_Parameters (int a, int b) 
	{   int subs;
	    subs = a-b ;
	    System.out.println(subs);
	}
	public void addition()
	{ 
			System.out.println("My name is Shridhar");	
	}
	public static void main(String[] args) {
		With_Parameters v = new With_Parameters(20,20,30); //parameters are specified in constructor
		//v.addition();
		
		With_Parameters g = new With_Parameters(60,40);
	    //g.addition();
		

	}

	

}
