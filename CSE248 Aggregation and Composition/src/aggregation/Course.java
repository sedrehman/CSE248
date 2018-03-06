package aggregation;

public class Course {
	private Instructor instructor;
	private Book book;
	private Classroom classroom;
	private Student[] students;

	public Course(Instructor i1, Book b1, Classroom c1) {
		instructor = i1;
		book = b1;
		classroom = c1;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	
}
