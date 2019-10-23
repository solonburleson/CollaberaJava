package lambda;

public class LambdaMultiParams {
	
	public static void main(String[] args) {
		Addable ad1 = (a,b) -> (a + b);
		System.out.println("a+b=" + ad1.add(5,7));
		
		Addable ad2 = (int a, int b) -> (a + b);
		System.out.println("a+b=" + ad2.add(50,70));
	}
}
