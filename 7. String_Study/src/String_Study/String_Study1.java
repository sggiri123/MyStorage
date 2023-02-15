package String_Study;

public class String_Study1 {
public static void main(String[] args) {
		
		String s="velocity";//without using new keyword--> constant pool area
		String s1="velocity";
		String s2="vel";
		String s3="Test";
		
		String m= new String("velocity");// using new keyword--> non-constant pool area
		String m1= new String("velocity");
		String m2= new String("VELOCITY");
		String m3= new String("");
		String m4= new String("Java Classes");
		
//		System.out.println(s2);
//		System.out.println(s==s1);//true
//		System.out.println(s==m);//false
//		System.out.println(m1.equals(m));//true
//		System.out.println(m1.equals(m2));//false
//		System.out.println(s1.equals(m));//true
//		System.out.println(m1.equalsIgnoreCase(m2));//true
//		System.out.println(s1.toUpperCase());
//		System.out.println(m2.toLowerCase());
//		System.out.println(m.length());
//		System.out.println(m.charAt(6));
//		System.out.println(m.contains("ocity"));
//		System.out.println(m2.isEmpty());
//		System.out.println(m3.isEmpty());
//		System.out.println(m2.charAt(7));//Y
//		System.out.println(m2.endsWith("ITY"));
//		System.out.println(m2.startsWith("VEL"));
//		System.out.println(m2.substring(3));
		System.out.println(m2.substring(1,3));
//        System.out.println(m1.concat(m4));
//		s3=m1.concat(m4);
//		System.out.println(s3);
//		System.out.println(s3.concat(" Pune"));
//		System.out.println(s3);
//		s3=s3+"Software Testing";
//      	System.out.println(s3);
//		System.out.println(s3.indexOf("e"));
//		System.out.println(s3.lastIndexOf("e"));
//		System.out.println(m4.replace("Java", "Manual"));
//        String m5 = m4.replace("Java", "Manual");
//		System.out.println(m4);
//		System.out.println(m5);
		String m6= "My,test";
		System.out.println(m6);
		String[] shri = m6.split(",");
        System.out.println(shri[1]);
	}

}
