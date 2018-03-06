package p2_GUIView;

import javafx.application.Application;
import javafx.stage.Stage;

public class Demo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Student model = new Student("Adam", "111");
		View view = new View(primaryStage);
		Controller controller = new Controller(model, view);
		controller.updateView();
		String[] info = controller.getStudentDetails();
		controller.setStudentDetails(info);
		controller.updateView();
	}

}
