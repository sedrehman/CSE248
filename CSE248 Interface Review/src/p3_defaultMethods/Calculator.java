package p3_defaultMethods;

public class Calculator implements IntCalculator{

	@Override
	public int doubleIt(int number) {
		return 2 * number;
	}

	@Override
	public int squareIt(int number) {
		return number * number;
	}

}
