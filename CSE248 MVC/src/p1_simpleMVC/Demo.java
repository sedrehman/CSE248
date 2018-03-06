package p1_simpleMVC;

public class Demo {

	public static void main(String[] args) {
		StudentModel model = new StudentModel("Bill", "111");
		View view = new View();
		Controller controller = new Controller(model, view);
		
		controller.updateView();
		controller.setName("Adam");
		controller.setId("222");
		controller.updateView();
		
	}

}
