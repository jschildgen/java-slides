package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class HelloApplication extends Application {

    protected static Scene scene;
    protected static FXMLLoader fxmlLoader;

    @Override
    public void start(Stage stage) throws IOException {
        fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        // when closing ask for confirmation
        stage.setOnCloseRequest(e -> {
            e.consume();
            if(ConfirmBox.display("Exit", "Are you sure you want to exit?")) {
                stage.close();
            }
        });

        // sample(ConfirmationAlert)
        stage.setOnCloseRequest(e -> {
            e.consume();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Wirklich beenden?");
            alert.setContentText("Soll das Programm wirklich beendet werden?");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                stage.close();
            }
        });
        // end-sample

    }

    // sample(ConfirmBox)
    private class ConfirmBox {          /* wurde von GitHub Copilot generiert */
        static boolean answer;

        public static boolean display(String title, String message) {
            Stage window = new Stage();

            //Block events to other windows
            window.initModality(Modality.APPLICATION_MODAL);
            window.setTitle(title);
            window.setMinWidth(250);

            Label label = new Label();
            label.setText(message);

            //Create two buttons
            Button yesButton = new Button("Yes");
            Button noButton = new Button("No");

            yesButton.setOnAction(e -> {
                answer = true;
                window.close();
            });
            noButton.setOnAction(e -> {
                answer = false;
                window.close();
            });

            VBox layout = new VBox(10);
            layout.getChildren().addAll(label, yesButton, noButton);
            layout.setAlignment(Pos.CENTER);

            //Display window and wait for it to be closed before returning
            Scene scene = new Scene(layout);
            window.setScene(scene);
            window.showAndWait();

            return answer;
        }
    }
    // end-sample

    public static void main(String[] args) {
        launch();
    }
}