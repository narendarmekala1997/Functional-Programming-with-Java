package programming;

import java.util.List;

public class Distinct {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		printDistinct(numbers);
	}
	private static void printDistinct(List<Integer> numbers) {
		
		numbers.stream()
			.distinct()
			.forEach(System.out::println);
	}

}
