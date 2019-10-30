package streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamRandom {

	public static void main(String[] args) {
		Random random = new Random();
		
		random.ints(5, 1, 50).sorted().forEach(System.out::println);
		
		random.doubles(5, 0, 0.5).sorted().forEach(System.out::println);
		
		List<Long> longs = random.longs(5).boxed().collect(Collectors.toList());
		System.out.println(longs);
	}

}
