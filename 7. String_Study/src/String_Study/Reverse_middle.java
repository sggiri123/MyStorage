package String_Study;

public class Reverse_middle {

	public static void main(String[] args) {
		
		String s = "My name is Shridhar";
		String [] p = s.split(" ");
		
		for (int i = 0; i<p.length; i++)
		{
			System.out.print(p[i]+ " ");
		}
		System.out.println();
		String k = p[1];
		char [] c = k.toCharArray();
		for (int i=c.length-1; i>=0; i--)
		{
			System.out.print(c[i]);
		}
		System.out.print(" ");
		String m = p[2];
		char [] d = m.toCharArray();
		for (int i=d.length-1; i>=0; i--)
		{
			System.out.print(d[i]);
		}
		
	}
       
}
