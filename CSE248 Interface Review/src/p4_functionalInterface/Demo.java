package p4_functionalInterface;

public class Demo {

	public static void main(String[] args) {
		// the beauty of lambda expression
		IntCalculator add = (x, y) -> x + y;
		IntCalculator subtract = (x, y) -> x - y;
		IntCalculator multiply = (x, y) -> x * y;
		IntCalculator divide = (x, y) -> {
			int z = (int)(x / y);
			return z;
		};
		
		System.out.println(add.calculate(5, 5));
		System.out.println(subtract.calculate(4, 6));
		System.out.println(multiply.calculate(5, 5));
		System.out.println(divide.calculate(4, 6));
		
	}

}
