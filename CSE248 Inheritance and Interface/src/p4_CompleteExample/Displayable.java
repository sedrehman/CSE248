package p4_CompleteExample;

public interface Displayable {
	default void display() {
		System.out.println("Display...");
	}
}
