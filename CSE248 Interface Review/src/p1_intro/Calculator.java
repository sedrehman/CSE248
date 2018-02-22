package p1_intro;

public class Calculator implements IntCalculator{

	@Override
	public int calculate(int number) {
		return number * number;
	}

}
