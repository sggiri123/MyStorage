package Array_Methods;
import java.util.Arrays;
import java.util.Scanner;
public class Array_Comparison {

	public static void main(String[] args) {
		int a[]= new int[3];
		int b[]= new int[3];
	
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter data in first array: ");
		
		for (int i=0; i<a.length; i++)
		{
			a[i]=s.nextInt();
		}
       System.out.println("Enter data in second array: ");
		
		for (int i=0; i<b.length; i++)
		{
			b[i]=s.nextInt();
		}
		boolean c =Arrays.equals(a, b);
		if (c == true)
		{
			System.out.println("The two arrays are equal");
		}
		else {
			System.out.println("The two arrays are not eqaul.");
		}
	}

}
