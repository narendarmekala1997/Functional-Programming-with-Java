package programming;

import java.util.List;
import java.util.stream.Collectors;

public class Collect {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		List<Integer> doubledNumbers = doubleNumbers(numbers);
		System.out.println(doubledNumbers);
	}

	private static List<Integer> doubleNumbers(List<Integer> numbers) {
		return numbers.stream()
				.map( x -> x*x )
				.collect(Collectors.toList());
	}

}
