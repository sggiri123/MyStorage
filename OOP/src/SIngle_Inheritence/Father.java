package SIngle_Inheritence;

public class Father {

	public static int addition () 
	{
		int x = 20;
		int y = 30;
		int sum;
		sum = x+y ;
		System.out.println("The sum is : " + sum);
		return sum;
	}

	public static void main(String[] args) {
		
		addition();
	
	}

}