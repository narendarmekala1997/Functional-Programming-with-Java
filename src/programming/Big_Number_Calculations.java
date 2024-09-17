package programming;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Big_Number_Calculations {

	public static void main(String[] args) {

		System.out.println( LongStream.rangeClosed(1, 20).reduce(1, (x,y)->x*y));
		System.out.println( LongStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,BigInteger::multiply));
	}

}
