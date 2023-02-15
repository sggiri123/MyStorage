package String_Study;

import java.util.Arrays;

public class Sequence_Characters {

	public static void main(String[] args) {
		
		String s = "janu"; //enter all letters in capital or all letters in small
		
		char [] p = s.toCharArray();
		
       Arrays.sort(p);
		for (int i = 0; i<p.length; i++)
		{
			System.out.print(p[i]);
		}

	}

}
