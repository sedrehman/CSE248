package p1_simpleMVC;

public class Controller {
	private StudentModel model;
	private View view;

	public Controller(StudentModel model, View view) {
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
		model.setId(id);
	}
	
	public String getId() {
		return model.getId();
	}
	
	public void updateView() {
		view.print(getName(), getId());
	}
 }
