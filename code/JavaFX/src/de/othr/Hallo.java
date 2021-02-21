package de.othr;

import javafx.application.Application;
// ... (weitere javafx-Imports)
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Hallo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hallo");
        StackPane pane = new StackPane();
        Button button = new Button();
        button.setText("Klick mich!");
        pane.getChildren().add(button);
        primaryStage.setScene(new Scene(pane, 200, 100));
        primaryStage.show();
    }
}
