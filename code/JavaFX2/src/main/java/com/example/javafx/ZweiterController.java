package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ZweiterController {

    @FXML TextField name;


    // sample(Datenaustausch)
    public void zurueck(ActionEvent actionEvent) throws IOException {
        Node node = (Node) actionEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(HelloApplication.scene);
        HelloController controller = HelloApplication.fxmlLoader
                .getController();
        controller.receiveData(name.getText());
    }
    // end-sample
}
