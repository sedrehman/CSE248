package manual;

public class StudentObserver implements Observer {
	private String name;
	private double gpa;
	private static int observerIdTracker = 0;
	private int observerId;
	
	private Student student;
	
	public StudentObserver(Subject student) {
		this.student = (Student)student;
		this.observerId = ++observerIdTracker;
		System.out.println("New Observer: " + this.observerId);
		this.student.register(this);
	}
	
	@Override
	public void update(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
		System.out.println(name + ": " + gpa);
	}

}
