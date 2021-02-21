package de.othr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


public class LoginController {
    @FXML private TextField email;
    @FXML private PasswordField password;
    @FXML private Button login_button;
    @FXML private Button cancel_button;

    public void cancel(ActionEvent actionEvent) {
        ((Stage)email.getScene().getWindow()).close();
    }

    public void emailChanged(KeyEvent keyEvent) {
        if(!email.getText().contains("@")) {
            email.setStyle("-fx-background-color: red");
            login_button.setDisable(true);
        } else {
            email.setStyle("-fx-background-color: none");
            login_button.setDisable(false);
        }
    }




}
