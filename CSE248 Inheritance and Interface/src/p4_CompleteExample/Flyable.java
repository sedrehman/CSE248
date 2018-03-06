package p4_CompleteExample;

public interface Flyable {
	default void fly() {
		System.out.println("Fly...");
	}
}
