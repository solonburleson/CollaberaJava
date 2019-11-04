package lambdas;

public class MathTest {

	public static void main(String[] args) {
		MathTest tester = new MathTest();
		
		MathOperation addition = (int a, int b) -> a + b;
		
		MathOperation subtraction = (a, b) -> a - b;
		
		MathOperation multiplication = (int a, int b) -> {return a * b;};
		
		MathOperation division = (a,b) -> a / b;
		
		System.out.println("10 + 5 = " + tester.operate(10,5,addition));
		System.out.println("10 - 5 = " + tester.operate(10,5,subtraction));
		System.out.println("10 * 5 = " + tester.operate(10,5,multiplication));
		System.out.println("10 / 5 = " + tester.operate(10,5,division));
	}
	
	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}
