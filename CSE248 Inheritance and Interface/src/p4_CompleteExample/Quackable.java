package p4_CompleteExample;

public interface Quackable {
	default void quack() {
		System.out.println("Quack...");
	}
}
