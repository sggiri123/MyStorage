package Array_Examples;

public class Odd_Even {

	public static void main(String[] args) {
		
		int [] s = {10,20,30,40,50,60,70};
		
		System.out.println("The odd index elements of array are: ");
		for (int i=0; i<s.length; i++)
		{
			if (i%2==1)
			{
				System.out.println(s[i]);
			}
		}
		System.out.println("The even index elements of array are: ");
		for (int i=0; i<s.length; i++)
		{
			if (i%2==0)
			{
				System.out.println(s[i]);
			}
		}
	
		
	}

}
