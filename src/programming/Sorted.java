package programming;

import java.util.Comparator;
import java.util.List;

public class Sorted {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		printSorted(numbers);
		printSortedStrings(courses);
	}
	private static void printSorted(List<Integer> numbers) {

		numbers.stream()
			.sorted()
			.forEach(System.out::println);
	}
	private static void printSortedStrings(List<String> numbers) {
		numbers.stream()
			//.sorted(Comparator.reverseOrder())
			.sorted(Comparator.comparing( str -> str.length()))
			.forEach(System.out::println);
	}
	

}
