package Method_Overriding_Runtime;

public class Child_Class {
	
	public void addition() 
	{
		int x = 2;
		int y = 3;
		System.out.println("The sum is : "+(x+y));
	}
	public void addition(int a, int b)
	{
		a = 5;
		b = 2;
		System.out.println("The sum is : "+(a+b));
	}
	public void money() {
		System.out.println("sons money 5000");
	}

	public static void main(String[] args) {
			
               Child_Class a = new Child_Class(); //Object type
				a.addition();
		        a.addition(40, 80);
		        a.money();
			}

		}
