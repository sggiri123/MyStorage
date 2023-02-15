package Non_Primitive_Casting;

public class Son extends Father{
	
	public void bike () 
	{
		System.out.println("Jawa");
	}
	
	public void car () 
	{
		System.out.println("Civic");
	}
	
	public void degree () 
	{
		System.out.println("BE");
	}

	public static void main(String[] args) {
		
		Son s = new Son ();
		s.bike();   //Over riding
		s.car();    //Over riding
		s.degree(); 
		
		Father f = new Son(); // up casting
		f.bike();             // Up casting
		f.car();              // Up casting
		
		Son a = (Son)f;       // Down Casting
		a.bike();             // Down Casting
		a.car();              // Down Casting
		a.degree();           // Down Casting
        
	}

}
