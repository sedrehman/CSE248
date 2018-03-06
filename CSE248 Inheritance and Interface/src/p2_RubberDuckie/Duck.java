package p2_RubberDuckie;

public abstract class Duck {
	public void quack() {
		System.out.println("Quack, quack...");
	}
	
	public void fly() {
		System.out.println("Flying ...");
	}

	public void swim() {
		System.out.println("Swim...");
	}

	public abstract void display();

}
