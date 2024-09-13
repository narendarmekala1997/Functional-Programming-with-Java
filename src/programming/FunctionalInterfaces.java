package programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		BinaryOperator<Integer> accumulator = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return t+u  ;
			}

			
			
		};
		int sum = numbers.stream()
					.reduce(0, accumulator);
		System.out.println(sum);
		
		Predicate<Integer> isEvenPredicate = x -> x%2 ==0;
		Function<Integer,Integer> squareFunction = x -> x*x;
		Consumer<Integer> sysoutConsumer = System.out::println;
		numbers.stream()
			.filter( isEvenPredicate )
			.map( squareFunction )
			.forEach( sysoutConsumer );
	}

}
