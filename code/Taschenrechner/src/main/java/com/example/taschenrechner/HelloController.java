package com.example.taschenrechner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField zahl1;
    @FXML
    TextField zahl2;
    @FXML
    Label ergebnis;

    public void addieren(ActionEvent actionEvent) {
        try {
            double d_zahl1 = Double.parseDouble(zahl1.getText());
            double d_zahl2 = Double.parseDouble(zahl2.getText());
            double summe = d_zahl1 + d_zahl2;
            ergebnis.setText(""+summe);
        } catch(NumberFormatException e) {
            ergebnis.setText("Fehler!");
            return;
        }
    }
}