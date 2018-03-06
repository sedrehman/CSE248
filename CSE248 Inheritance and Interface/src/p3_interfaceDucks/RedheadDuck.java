package p3_interfaceDucks;

public class RedheadDuck extends Duck implements Flyable{

	@Override
	public void display() {
		System.out.println("Showing a Redhead duck!");
	}

	@Override
	public void fly() {
		System.out.println("Flying ...");
	}
}
