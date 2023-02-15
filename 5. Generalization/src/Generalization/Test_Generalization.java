package Generalization;

public class Test_Generalization {

	public static void main(String[] args) {
		
		Jio j = new Jio();
		System.out.println("=====Jio====");
		j.call();
		j.data();
		j.msg();
		j.NewMethod_Jio();
		
		Airtel a = new Airtel();
		System.out.println("===Airtel====");
		a.call();
		a.data();
		a.msg();
		a.NewMethod_Airtel();
		
		Vodafone v = new Vodafone();
		System.out.println("===Vodafone===");
		v.call();
		v.data();
		v.msg();
		v.NewMethod_Vodafone();

	}

}
