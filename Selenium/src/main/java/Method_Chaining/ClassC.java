package Method_Chaining;

public class ClassC {

	public static void main(String[] args) {
		
		String p= ClassA.demo1().demo2().demo3();    //Method chaining
		
		System.out.println(p);

	}
	public static String demo3()
	{
		String a ="I am mad";
		return a;
	}

}
