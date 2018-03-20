package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
	@FXML
	private Label messageLbl;
	
	public void clickMe(ActionEvent e) {
		messageLbl.setText("The button is clicked!");
	}
}
