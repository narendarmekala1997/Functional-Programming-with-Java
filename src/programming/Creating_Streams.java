package programming;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Creating_Streams {
	
	public static void main(String args[]) {
		
	Stream.of(12,13,9,46,2,4,12,15).forEach(System.out::println);
	
	System.out.println(Stream.of(12,9,13,4,6,2,4,12,15).count());
		
    System.out.println(	Stream.of(12,13,9,4,6,2,4,12,15).reduce(0,Integer::sum));
    
    int[] numberArray = {12,13,9,4,6,2,4,12,15};
    
    //primitive stream
    Arrays.stream(numberArray);
    
    System.out.println(Arrays.stream(numberArray).average());
    System.out.println(Arrays.stream(numberArray).sum());
    System.out.println(Arrays.stream(numberArray).min());
    System.out.println(Arrays.stream(numberArray).max());
    
    
   System.out.println( IntStream.range(1, 10).sum());
   System.out.println( IntStream.rangeClosed(1, 10).sum());
   System.out.println( IntStream.iterate(0, e->e+2).peek(System.out::println).limit(10).sum());
   System.out.println( IntStream.iterate(2, e->e*2).peek(System.out::println).limit(10).sum());
    
	
	}

}
