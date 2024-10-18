package programming;

import java.util.stream.IntStream;

public class Checking_PrimeNumber_Using_Streams {

	public static void main(String[] args) {

		int number =28;
		
		boolean isPrime = isPrime(number);
		
		System.out.println(number + (isPrime ? " is a Prime Number":" is Not a Prime Number"));
	}

	private static boolean isPrime(int number) {
		
		
		return IntStream.rangeClosed(2, (int)Math.sqrt(number))
				.noneMatch( i -> number%i==0 );
	}

}
