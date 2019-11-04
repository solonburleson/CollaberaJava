package methodreferences;

import java.util.ArrayList;
import java.util.List;

public class MethodReferencesTest {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Jack");
		names.add("Jill");
		names.forEach(System.out::println);
	}

}
