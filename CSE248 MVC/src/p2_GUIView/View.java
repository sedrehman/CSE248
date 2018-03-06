package p2_GUIView;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class View {
	private Label nameLbl;
	private Label idLbl;
	private Button okBtn;
	private TextField nameField;
	private TextField idField;
	private HBox pane;
	private Stage stage;
	private String[] info = new String[2];
	
	public View(Stage stage) {
		this.stage = stage;
		nameLbl = new Label("Name: ");
		nameLbl.setAlignment(Pos.CENTER_RIGHT);
		idLbl = new Label("ID: ");
		idLbl.setAlignment(Pos.CENTER_RIGHT);
		okBtn = new Button("OK");
		nameField = new TextField();
		idField = new TextField();
		pane = new HBox(30);
		pane.setAlignment(Pos.CENTER);
		
		okBtn.setOnAction(event -> {
			String name = nameField.getText();
			String id = idField.getText();
			info[0] = name;
			info[1] = id;
//			Student s = new Student(name, id);
			printStudentDetails(info[0], info[1]);
		});
		
		pane.getChildren().addAll(nameLbl, nameField, idLbl, idField, okBtn);
		stage.setScene(new Scene(pane, 600, 100));
		stage.show();
	}
	
	public String[] getStudentDetails() {
		return info;
	}
	
	public void printStudentDetails(String name, String id) {
		System.out.println("Student: ");
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
	}
}
