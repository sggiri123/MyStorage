package Array_Examples;

public class Example_3 {
	public static void main(String[] args) {
		
String name[]= {"Velocity","Corporate","training","Center"};
		
		System.out.println(name.length);
		
		int RollNo[]= {1,2,3,4,5};
		
		System.out.println(RollNo[2]);
		
		char Grade[]= {'A','B','C'};
		
		System.out.println(Grade[0]);
		
			
			int ar[][]= {{10,20,30},{40,50,60},{70,80,90}};
	
		System.out.println(ar[1][2]);
			
			for(int i=0;i<=2;i++)
			{
			 for (int j=0;j<=2;j++)
			 {
				 System.out.print(ar[i][j]+" ");
			 }
			 System.out.println();
			}
			
}
}