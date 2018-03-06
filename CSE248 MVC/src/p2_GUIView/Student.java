package p2_GUIView;

public class Student {
	private String name;
	private String idNumber;

	public Student(String name, String idNumber) {
		super();
		this.name = name;
		this.idNumber = idNumber;
	}
	
	public Student() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

}
