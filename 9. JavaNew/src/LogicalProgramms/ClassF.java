
package LogicalProgramms;

public class ClassF {

	public static void main(String[] args) {
		
		//Add first 10 digits except 8
		
		int sum = 0;     
		
		for(int i=1; i<=10; i++) {
			
			if(i!=8) 
			{
				continue;
			}
			
			sum = sum + i;
		}
		
		System.out.println(sum);

	}

}
