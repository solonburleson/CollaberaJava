package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitSkipTest {

	public static void main(String[] args) {
		List<Integer> array = Arrays.asList(-1,0,4,6,8);
		
		System.out.println(array.stream().limit(3).collect(Collectors.toList()));
		
		System.out.println(array.stream().skip(2).collect(Collectors.toList()));
	}

}
