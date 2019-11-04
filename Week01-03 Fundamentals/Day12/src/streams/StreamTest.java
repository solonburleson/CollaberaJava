package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		
		List<String> filtered = strings.stream()
				.filter(string -> !string.isEmpty())
				.collect(Collectors.toList());
		
		filtered.forEach(System.out::print);
		System.out.println();
		
		strings.stream().filter(string -> !string.isEmpty()).forEach(System.out::print);
		System.out.println();
		
		List.of("This"," is ", "created ", "by ", "List.of().parallelStream()")
			.parallelStream()
			.forEach(System.out::print);
		System.out.println();
		
		List.of("This ", "is ", "created ", "by ", "stream() 1").stream().forEach(System.out::print);
		
		System.out.println();
		
		Stream.of("This ", "is ", "created ", "by ", "stream() 2").forEach(System.out::print);
	}

}
