package String_Study;

public class Seperate_Digits_String {

	public static void main(String[] args) {
		
		String s = "Shridhar123";
		
		System.out.println(s.replaceAll("[0-9]", ""));		
		System.out.println(s.replaceAll("[^0-9]", ""));
		
	
	    char [] b = s.toCharArray();
	    int sum = 0;
	    
	    for (int i = 0; i<b.length; i++)
	    {
	    	if (Character.isDigit(b[i]))
	    	{
	    		System.out.println(b[i]);
	    		
	    		int a = Integer.parseInt(String.valueOf(b[i]));
	    		
	    		sum += a;
	    	}
	    	
	    }
	   System.out.println("The sum of digits in string is : "+sum);
		
	
	}

}
