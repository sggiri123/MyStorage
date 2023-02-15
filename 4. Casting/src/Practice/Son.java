package Practice;

public class Son extends Father {
	
	public void car ()
	{
		System.out.println("Honda civic");
		
	}
	
	public void bike ()
	{
		System.out.println("java");
	}
  
	public void degree()
	{
		System.out.println("BE");
	}
	public static void main(String[] args) {
		
	   Father s = new Son(); // up casting Explicitly 
		s.car();
		s.bike();
//    	s.degree();
		
		Son d = (Son)s; // Down casting Explicitly 
		d.car();
		d.bike();
		d.degree();
	}
}
