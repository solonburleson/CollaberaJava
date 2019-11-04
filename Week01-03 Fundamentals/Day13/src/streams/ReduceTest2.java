package streams;

import java.util.stream.IntStream;

public class ReduceTest2 {

	public static void main(String[] args) {
		int product = IntStream.range(1,5)
							   .reduce((num1,num2) -> num1 * num2)
							   .orElse(-1);

		System.out.println("The product is: " + product);
	}

}
