package com.example.javafx;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;

import java.math.BigDecimal;

public class WaehrungsumrechnerController {
    @FXML TextField input;
    @FXML Label result;
    @FXML RadioButton usd;
    @FXML RadioButton gbp;

    void initialize() {

    }

    public void berechne(ActionEvent actionEvent) {
        BigDecimal betrag;
        try {
            betrag = new BigDecimal(input.getText());
        } catch (NumberFormatException e) {
            result.setText("Bitte eine Zahl eingeben");
            return;
        }
        if (usd.isSelected()) {
            result.setText(betrag.multiply(new BigDecimal("1.2")).toString());
        } else {
            result.setText(betrag.multiply(new BigDecimal("0.8")).toString());
        }
    }
}
