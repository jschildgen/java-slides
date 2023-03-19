package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    // sample(ZweiteScene)
    void onHelloButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("zweite.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Node node = (Node) actionEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(scene);
    }
    // end-sample

    // sample(receiveData)
    void receiveData(String name) throws IOException {
        welcomeText.setText("Hello " + name);
    }
    // end-sample
}