package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField anfangskapital;
    @FXML
    TextField zinssatz;
    @FXML
    TextField jahre;
    @FXML
    TextField endkapital;

    @FXML
    public void zinsen_berechnen(ActionEvent actionEvent) {
        double a, x, t;

        try {
            a = Double.parseDouble(anfangskapital.getText());
        } catch (NumberFormatException e) {
            endkapital.setText("Anfangskapital: Ungültiger Wert");
            return;
        }
        try {
            x = 1 + Double.parseDouble(zinssatz.getText()) / 100;
        } catch (NumberFormatException e) {
            endkapital.setText("Zinssatz: Ungültiger Wert");
            return;
        }
        try {
            t = Double.parseDouble(jahre.getText());
        } catch (NumberFormatException e) {
            endkapital.setText("Jahre: Ungültiger Wert");
            return;
        }
        double res = a * Math.pow(x, t);
        endkapital.setText(String.format("%.2f", res));
    }
}