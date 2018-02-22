package p3_defaultMethods;

public interface IntCalculator {
	int doubleIt(int number);
	int squareIt(int number);
	
	default int add(int number1, int number2) {
		return number1 + number2;
	}

	default int subtract(int number1, int number2) {
		return number1 - number2;
	}

	default int multiply(int number1, int number2) {
		return number1 * number2;
	}

	default int divide(int number1, int number2) {
		return number1 / number2;
	}

}
