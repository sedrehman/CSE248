package p2_anonymousClass;

public class Demo {

	public static void main(String[] args) {
		IntCalculator c1 = new IntCalculator() {

			@Override
			public int square(int number) {
				return number * number;
			}

			@Override
			public int doubleIt(int number) {
				return 2 * number;
			}

		};
		
		System.out.println(c1.square(5));
		System.out.println(c1.doubleIt(5));
		
		IntCalculator c2 = new IntCalculator() {

			@Override
			public int square(int number) {
				return number * number;
			}

			@Override
			public int doubleIt(int number) {
				return 2 * number;
			}
			
		};
		
		System.out.println(c2.square(3));
		System.out.println(c2.doubleIt(3));
	}

}
