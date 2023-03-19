package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PropertiesController {
    // sample(bindings)
    @FXML TextField input_name;
    @FXML Label output_name;

    @FXML
    public void initialize() {
        Person person = new Person();
        person.nameProperty().bindBidirectional(input_name.textProperty());
        output_name.textProperty().bind(person.nameProperty());
    }
    // end-sample

    public void gingeauchso() {
        // sample(bindings2)
        output_name.textProperty().bind(input_name.textProperty());
        // end-sample
    }
}
