package p4_CompleteExample;

public interface Swimable {
	default void swim() {
		System.out.println("Swim...");
	}
}
