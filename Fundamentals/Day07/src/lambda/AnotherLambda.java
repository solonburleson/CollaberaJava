package lambda;

public class AnotherLambda {

	public static void main(String[] args) {
		MyInterface inter = () -> 3.1415;

		System.out.println("Value of PI: " + inter.getPiValue());
	}

}
