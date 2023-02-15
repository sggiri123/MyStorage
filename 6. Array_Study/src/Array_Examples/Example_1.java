package Array_Examples;

import java.util.Arrays;

public class Example_1 {

	public static void main(String[] args) {
		
		String [] a = new String[3];
		a[0] = "Shridhar";
		a[1] = "Ganesh";
		a[2] = "Giri";
		
		String [] b = {"Shridhar", "Ganesh", "Giri"};
		
		System.out.println(Arrays.equals(a,b));
		
		System.out.println(a.length);
		
		for (int i = 0; i<=2; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i = 2; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
