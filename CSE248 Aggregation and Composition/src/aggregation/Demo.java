package aggregation;

public class Demo {

	public static void main(String[] args) {
		Instructor i = new Instructor();
		Book b = new Book();
		Classroom c = new Classroom();
		Course c1 = new Course(i, b, c);
		c1 = null;
		System.out.println(c1);
		System.out.println(i);
	}

}
