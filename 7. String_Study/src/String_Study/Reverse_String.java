package String_Study;
import java.util.Scanner;
public class Reverse_String {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = a.nextLine();
		String n = "";
		String l="";
		char ch;
		char h;
		
		System.out.println("Enter a number: ");
		int k= a.nextInt();
		
		String g = Integer.toString(k);		
		for(int i = 0; i<s.length(); i++)
          {
	         ch = s.charAt(i);
	         n = ch + n;
          }
          System.out.println("The reverse of string is : "+n);       
          for(int i = 0; i<g.length(); i++)
          {
        	  h = g.charAt(i);
 	         l = h + l;
          }
          System.out.println(l);
        	  
          }
	}

 
