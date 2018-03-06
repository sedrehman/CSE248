package p2_GUIView;

public class Controller {
	private Student model;
	private View view;

	private String StudentName;
	private String studentId;

	public Controller(Student model, View view) {
		this.model = model;
		this.view = view;
	}

	public void setName(String name) {
		model.setName(name);
	}

	public String getName() {
		return model.getName();
	}

	public void setId(String id) {
		model.setIdNumber(id);
	}

	public String getId() {
		return model.getIdNumber();
	}

	public String[] getStudentDetails() {
		return view.getStudentDetails();
	}

	public void setStudentDetails(String[] info) {
		model.setName(info[0]);
		model.setIdNumber(info[1]);
	}

	public void updateView() {
		view.printStudentDetails(model.getName(), model.getIdNumber());
	}
}
