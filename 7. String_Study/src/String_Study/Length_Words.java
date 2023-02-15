package String_Study;

public class Length_Words {

	public static void main(String[] args) {
		
		String s = "Please give me some sunshine";
		int count = 0;
		for (int i =0; i<s.length(); i++)
		{
		       if (s.charAt(i)== ' ')
		       {
		    	   count++ ;
		       }
		}
		System.out.println("The number of white spaces in the string : " +count);
		
	
		String [] p= s.split(" ");
		
		System.out.println(s.substring(0,1).toUpperCase()+s.substring(1)); //upper case 1st letter
		
		
		for (int i = 0; i<p.length; i++)
		{
			System.out.println(p[i]);
			System.out.println(p[i].length());
		}
		
		System.out.println("The number of words in Array: " + p.length);

	}

}
