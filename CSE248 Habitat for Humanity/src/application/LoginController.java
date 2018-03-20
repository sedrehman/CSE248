package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {
	private LoginModel loginModel = new LoginModel();
	@FXML
	private Label messageLbl;
	@FXML
	private TextField usernameField;
	@FXML
	private PasswordField passwordField;
	
	public void login(ActionEvent event) {
		messageLbl.setText("Login button is clicked!");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		if(loginModel.isDBConnected()) {
			messageLbl.setText("Connected");
		} else {
			messageLbl.setText("Not Connected");
		}
	}

}
