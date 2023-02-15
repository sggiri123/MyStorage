package This_Super;

public class This extends Super {
	
	int x = 10;
	
	static int y = 20;
	
	public void method () {
		System.out.println("Hi i am static method from This class");
	}
	
	public void method1 () {
		System.out.println("Hi i am non static method from This class");
	}

	public void This_Super() {
		this.method();
		super.method1();
		
		System.out.println(this.x + this.y);
		System.out.println(super.x + super.y);
	}

	public static void main(String[] args) {
		This a = new This();
		
		a.This_Super(); 

	}

}
