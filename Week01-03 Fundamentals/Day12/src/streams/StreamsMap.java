package streams;

import java.util.Arrays;
import java.util.List;

public class StreamsMap {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("name3", "", "Adam", "name10", "", "Alex");
		
		names.stream()
			.filter((s) -> s.startsWith("A"))
			.map(String::toUpperCase)
			.forEach(System.out::println);
	}

}
