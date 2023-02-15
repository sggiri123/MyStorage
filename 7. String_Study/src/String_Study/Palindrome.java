package String_Study;

public class Palindrome {

	public static void main(String[] args) {
		
		String s = "Shridhar";
		String c = "";
		
		for (int i=0; i<s.length(); i++)
     {
	   char t = s.charAt(i);
	    c = t+ c ;   
     }
		if (s.equalsIgnoreCase(c))
		{
			System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("The given string is not palindrome");
		}
		System.out.println(c);
		
	
	}

}
