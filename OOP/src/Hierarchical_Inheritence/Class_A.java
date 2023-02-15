package Hierarchical_Inheritence;

public class Class_A {
	
	
	public static void divide () {
		int x = 20;
		int y = 10;
		System.out.println("The division is : " + (x/y));
	}
	
	public  int Addition() {
		int z = 5;
		int k = 20;
		System.out.println("The sum is : " + (z+k));
		return (z+k);	
	}
	public static void main(String[] args) {
		
		divide();
		
		Class_A b = new Class_A();
		b.Addition();		
	}
}
