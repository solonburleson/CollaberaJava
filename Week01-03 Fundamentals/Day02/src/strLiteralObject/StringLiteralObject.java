package strLiteralObject;

public class StringLiteralObject {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = s1;
		String s4 = new String("Hello");
		String s5 = new String("Hello");
		
		System.out.println("s1 == s2 " + (s1 == s2)); //true
		System.out.println("s1 == s3 " + (s1 == s3)); //true
		System.out.println("s1.equals(s3) " + (s1.equals(s3))); //true
		System.out.println("s1 == s4 " + (s1 == s4)); //false
		System.out.println("s1.equals(s4) " + (s1.equals(s4))); //true
		System.out.println("s4 == s5 " + (s4 == s5)); //false
		System.out.println("s4.equals(s5) " + (s4.equals(s5))); //true
	}

}
