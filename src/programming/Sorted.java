package programming;

import java.util.List;

public class Sorted {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		printSorted(numbers);
	}
	private static void printSorted(List<Integer> numbers) {

		numbers.stream()
			.sorted()
			.forEach(System.out::println);
	}
	

}
