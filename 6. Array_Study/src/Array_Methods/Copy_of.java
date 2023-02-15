package Array_Methods;
import java.util.Arrays;
import java.util.Scanner;
public class Copy_of {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[]= new int[4];
		System.out.println("Enter data for first array : ");
		for (int i=0; i<a.length; i++)
		{
			a[i] = s.nextInt();	
		}
		
		int b[] = Arrays.copyOf(a, 5); //size of array b is increased to print added element.
		b[4]=100;    // newly added value in b array.
	   
		System.out.println("The data in 2nd array is : ");
				for (int i=0; i<b.length; i++)
				{
					System.out.println(b[i]);
				}
		int [] c = Arrays.copyOfRange(b, 2, 4); //use of copyofRange(from index to index).
		
		for (int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
		
	}

}
