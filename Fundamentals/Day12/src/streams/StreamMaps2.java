package streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class StreamMaps2 {

	public static void main(String[] args) {
		Map<String,String> books = new HashMap<>();
		
		books.put("978-0201633610", "Design patterns: elements of reusable object oriented-software");
		books.put("978-161729999", "Java 8 in Action: Lambdas,Streams,and functional-style programming");
		books.put("978-0134685991", "Effective Java");
		
		Optional<String> optionalIsbn = books.entrySet().stream()
										.filter(book -> book.getValue().contains("Effective Java"))
										.map(Map.Entry::getKey)
										.findFirst();
		
		optionalIsbn.ifPresent(System.out::println);
	}

}
