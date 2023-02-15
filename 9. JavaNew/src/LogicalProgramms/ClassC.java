package LogicalProgramms;

public class ClassC {

	public static void main(String[] args) {
		
		for(int j=1; j<=5; j++) {
			
			for(int i=1; i<(6-j); i++) {
				System.out.print("  ");
			}
			
			for(int k=1; k<=j; k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
}