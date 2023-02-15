package Interface_Study;

public class Implimentation_Class implements Interface{

	public int addition() 
	{
		int a=5;
		int b =10;
		System.out.println(a+b);	
		return (a+b);
	}
	public void substraction()
	{
		int y = 15;
		int z = 5;
		System.out.println(y-z);
	}
	
	


	public static void main(String[] args) {
		System.out.println(a);
		
		Implimentation_Class a = new Implimentation_Class();
		
		a.addition();
		a.substraction();

	}
	@Override
	public char multiplication() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void division() {
		// TODO Auto-generated method stub
		
	}

}
