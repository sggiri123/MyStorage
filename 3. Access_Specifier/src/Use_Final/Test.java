package Use_Final;

public class Test extends Parent{
	
	final int x =10;
          int y = 15;
          
//          void addition() // can not override method since we used final keyword in Parent class.
//          {
//        	  int a = 10;
//        	  int b = 15;
//        	  System.out.println(a+b);
//          }

	public static void main(String[] args) {
		
		Test o = new Test();
		//o.x = 25;  // value will not be changed here because we used final keyword first.
        o.y = 20;  //we can change value of variable if final is not written.
		System.out.println(o.x);
		System.out.println(o.y);
		
		o.addition();
	}

}
