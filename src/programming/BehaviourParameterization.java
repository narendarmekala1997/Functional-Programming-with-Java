package programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BehaviourParameterization {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		
		
		filterAndPrint(numbers, x -> x%2==0);
		filterAndPrint(numbers, x -> x%2!=0);
		
		Function<Integer, Integer> mapper = x->x*x;
		List<Integer> squares = extracted(numbers, x->x*x);
		List<Integer> cubes = extracted(numbers, x->x*x*x);
		System.out.println(squares);
		System.out.println(cubes);
		
		
	}

	private static List<Integer> extracted(List<Integer> numbers, Function<Integer, Integer> mapper) {
		return numbers.stream()
		.map(mapper)
		.collect(Collectors.toList());
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream()
		.filter( predicate )
		.forEach(System.out::println);
	}

}
