package tipptrainer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TippTrainer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("tipptrainer.fxml"));
        primaryStage.setTitle("Tipp-Trainer");
        primaryStage.setScene(new Scene(root, 300, 190));
        primaryStage.show();
    }
}
