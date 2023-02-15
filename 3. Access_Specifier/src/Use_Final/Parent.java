package Use_Final;

public class Parent {
	
	final void addition()
	{
		int x = 20;
		int y = 30;
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		Parent p = new Parent ();
          p.addition();
	}

}
