package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PropertiesApp extends Application {


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("properties-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 150);
        stage.setTitle("Personendaten");
        stage.setScene(scene);
        stage.show();
    }
}
