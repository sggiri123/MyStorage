package LogicalProgramms;

public class ClassG {

	public static void main(String[] args) {
		
		String a = "asv45rtg1278wgpd63";

		int sum =0;
		
		for(int i=0; i<a.length(); i++) {
			
			String k = String.valueOf(a.charAt(i));
			
			try 
			{
				sum = sum + Integer.parseInt(k);
			}catch(Exception e) 
			{
			//	System.out.println( k +" is not numeric");
			}	
		}
		
		
		System.out.println(sum);
		
		
	}

}
