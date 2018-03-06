package p3_interfaceDucks;

public abstract class Duck {
	public void quack() {
		System.out.println("Quack, quack...");
	}
	
	public void swim() {
		System.out.println("Swim...");
	}

	public abstract void display();

}
