package Abstract;

public class Concrete extends Abstract_Class {
	
	public void test3 () {
		System.out.println("Hi i am test 3");
	}
	
	public void test4 () {
		System.out.println("Hi i am test 4");
	}
    
	public static void test5() 
	{
	System.out.println("Hi i am own method test 5");
    }
	public static void main(String[] args) {
		
		test5();
		
		Abstract_Class a = new Concrete();
		a.test1();
		a.test2();
		a.test3();
		a.test4();
		
		
		

	}

}
