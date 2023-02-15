package Array_Examples;

public class Largest_Number {

	public static void main(String[] args) {
		
		int [] a = {20,50,30,55,60};
		
	  	int largest=a[0];
	  	    
		
		for (int i=0; i<a.length ; i++)
		{
			if (largest<a[i])
				{
					largest = a[i];
				}
		}
         System.out.println("largest number in array is : "+largest);
	}
	}