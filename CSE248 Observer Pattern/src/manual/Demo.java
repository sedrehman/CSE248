package manual;

public class Demo {

	public static void main(String[] args) {
		Student s = new Student("Adam", 2.0);
		Observer observer1 = new StudentObserver(s);
		s.setGpa(1.0);
		System.out.println("--------------");
		Observer observer2 = new StudentObserver(s);
		s.setGpa(3.0);
	}

}
