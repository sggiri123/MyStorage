package Array_Examples;
import java.util.Scanner;
public class Search_Element {

	public static void main(String[] args) {
		int []a = new int [5];
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for (int i=0; i<a.length; i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("Array Elements are: ");
       for(int i=0; i<a.length; i++)
       {
    	   System.out.println(a[i]);
       }
       System.out.println("Enter a search element: ");
       int n = s.nextInt();
       int count = 0;
       for (int i=0; i<a.length; i++)
       {
    	   if (a[i]==n)
    	   {
    		   count++;
    	   }	     
       }
       if (count>0)
       {
       System.out.println("Item found " +count+ " times");
	   }
       else {
    	   System.out.println("Item not found");
       }
      
}
}
