package String_Study;

public class String_Prgm {

	public static void main(String[] args) {
		
		String s ="Java is a programming language";
		int count=0;
		
		for (int i=0; i<s.length(); i++)
		{
			if (s.charAt(i)== 'a')
			{
				count++;	
			}
		
		}
		String b = s.replace('a', 'Q');
		System.out.println(count);
		System.out.println(b);
		

	}

}
