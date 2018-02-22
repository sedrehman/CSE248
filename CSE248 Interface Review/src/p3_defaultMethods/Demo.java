package p3_defaultMethods;

public class Demo {

	public static void main(String[] args) {
		IntCalculator c1 = new Calculator();
		System.out.println(c1.add(5, 5));
		System.out.println(c1.subtract(5, 5));
		System.out.println(c1.multiply(5, 5));
		System.out.println(c1.divide(5, 5));
		System.out.println(c1.doubleIt(5));
		System.out.println(c1.squareIt(5));
	}

}
