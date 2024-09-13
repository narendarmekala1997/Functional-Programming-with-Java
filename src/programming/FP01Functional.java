package programming;

import java.util.List;

public class FP01Functional {
	
	public static void main(String args[]) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		printAllNumbersInListFunctional(numbers);
		printEvenNumbersInListFunctional(numbers);
	}
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
				.forEach(System.out::println);//Method Reference
	}
	private static boolean isEven(int number) {
		return number%2==0;
	}
	//printing Even numbers
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
				.filter(FP01Functional::isEven)
				.forEach(System.out::println);//Method Reference
	}

}
