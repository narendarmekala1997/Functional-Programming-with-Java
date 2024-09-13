package programming;

import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SupplierEx {

	public static void main(String[] args) {

		Supplier<Integer> random = ()->{
			Random r = new Random();
			return r.nextInt(1000);
		};
		System.out.println(random.get());
		
		UnaryOperator<Integer> unary = (x)-> 3*x;
		System.out.println(unary.apply(3));
		
		
	}

}
