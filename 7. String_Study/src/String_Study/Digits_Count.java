package String_Study;
import java.util.Scanner;
public class Digits_Count {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int b = a.nextInt();

		
		String c = Integer.toString(b);
		
		System.out.println("The number of digits are: "+ c.length());

	}

}
