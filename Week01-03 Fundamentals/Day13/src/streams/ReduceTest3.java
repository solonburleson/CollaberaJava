package streams;

import java.util.Arrays;
import java.util.List;

public class ReduceTest3 {

	public static void main(String[] args) {
		List<Integer> array = Arrays.asList(-1,0,4,6,8);
		
		int sum = array.stream().reduce(0,(num1,num2) -> num1 + num2);
		int sum1 = array.stream().reduce(0, Integer::sum);
		
		System.out.println("The sum of all elements is: " + sum);
		System.out.println("The sum of all elements is: " + sum1);
	}

}
