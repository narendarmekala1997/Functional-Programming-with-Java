package programming;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicates {

	public static void main(String[] args) {

		BiPredicate<Integer,String> biPredicate = (number,str) -> {
			return number<10 && str.length()>5;
		};
		System.out.println(biPredicate.test(1, "narendar"));
		
		BiFunction<Integer, String, String> biFunction = (number,str) -> {
			
			return "sample";
		};
		System.out.println(biFunction.apply(10, "naren"));
		BiConsumer<String, String> biConsumer = (str,str1) -> {
			System.out.println(str +" "+str1);
		};
		biConsumer.accept("narender", "mekala");
	}

}
