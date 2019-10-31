package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalsExercise {

	public static void main(String[] args) {
		List<Optional<String>> listOfOptionals = Arrays.asList(Optional.empty(),Optional.of("foo"), Optional.empty(), Optional.of("bar"));
		
		List<String> stringsList = listOfOptionals.stream()
												  .filter(s -> !s.isEmpty())
												  .map(s -> s.get())
												  .collect(Collectors.toList());
		
		System.out.println(stringsList);
	}

}
