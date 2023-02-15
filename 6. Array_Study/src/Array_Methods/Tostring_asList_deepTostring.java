package Array_Methods;
import java.util.Arrays;
public class Tostring_asList_deepTostring {

	public static void main(String[] args) {
		
		int [] s = {10,20,30,40};
		
		String [] a = {"Shridhar", "Vaibhav", "Reyavan", "Jyoti", "Neha"};
		
		int [][] b = {{10,20},{30,40}};
		
		System.out.println("Output of toString(): "+ Arrays.toString(s)); //used for int array type
		System.out.println("Output of asList(): "+ Arrays.asList(a)); //used for string array
		System.out.println("Output of deepToString(): "+ Arrays.deepToString(b));// used for double array
		

	}

}
