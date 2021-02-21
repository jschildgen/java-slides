package de.othr;

import javafx.application.Application;
// ... (weitere javafx-Imports)
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Login extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Login");
        VBox vbox = new VBox();
        TextField email = new TextField();
        TextField password = new PasswordField();
        Button login_button = new Button();
        login_button.setText("Einloggen");
        Button cancel_button = new Button();
        cancel_button.setText("Abbrechen");

        HBox hbox = new HBox();
        hbox.getChildren().addAll(login_button, cancel_button);
        hbox.setAlignment(Pos.CENTER);

        vbox.getChildren().addAll(new Label("E-Mail:"), email,
                new Label("Passwort:"), password, hbox);

        primaryStage.setScene(new Scene(vbox, 200, 110));
        primaryStage.show();

        cancel_button.setOnAction(ev -> primaryStage.close());

        email.setOnKeyReleased(ev -> {
            if(!email.getText().contains("@")) {
                email.setStyle("-fx-background-color: red");
                login_button.setDisable(true);
            } else {
                email.setStyle("-fx-background-color: none");
                login_button.setDisable(false);
            }
        });
    }
}
