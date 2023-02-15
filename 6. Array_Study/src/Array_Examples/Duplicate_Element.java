package Array_Examples;

public class Duplicate_Element {

	public static void main(String[] args) {
		
		int [] a = {10,15,20,25,20,25,30,35,35};
		
		for (int i= 0; i<a.length-1; i++)
		{
			for (int j= i+1 ; j<a.length; j++)
			{
				if (a[i]==a[j])
			   	{
					System.out.println(a[j]);
				}
			}
		}
		
		

	}

}
