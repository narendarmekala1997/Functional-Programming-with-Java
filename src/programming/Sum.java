package programming;

import java.util.List;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<Integer> numbers = List.of(1,2,3,4,5,6,7);
		
		int sum = addNumbers(numbers);
		System.out.println(sum);

	}
	private static int add(int a, int b) {
		return a+b;
	}
	private static int addNumbers(List<Integer> numbers) {
		
		return numbers.stream()
				//.reduce(0, Sum::add);
				.reduce(0, (x,y) -> x+y );
	}

}
