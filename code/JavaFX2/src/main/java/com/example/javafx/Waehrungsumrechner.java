package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Waehrungsumrechner extends Application {


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("gridpane.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 150);
        stage.setTitle("Währungsumrechner");
        stage.setScene(scene);
        stage.show();
    }
}
