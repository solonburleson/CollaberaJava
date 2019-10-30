package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		list.stream()
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println);
		
		List<Integer> evenNumbers = list.stream()
										.filter(n -> n % 2 == 0)
										.collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		List<Integer> evenSquares = list.stream()
										.filter(n -> n % 2 == 0)
										.map(n -> n*n)
										.collect(Collectors.toList());
		
		System.out.println(evenSquares);
	}

}
