package tipptrainer;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class TipptrainerController {
    @FXML TextArea eingabe;
    @FXML Label ausgabe;

    boolean laeuft = false;

    public void onEingabe(KeyEvent keyEvent) {
        if(laeuft) { return; }

        new Thread(() -> {
            try {
                laeuft = true;
                Thread.sleep(15000);
                laeuft = false;
                Platform.runLater(() -> {
                    eingabe.setDisable(true);
                    int anschlaege = eingabe.getText().length()*4;
                    ausgabe.setText("Anschläge pro Minute: "+anschlaege);
                });

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public void reset(ActionEvent actionEvent) {
        laeuft = false;
        eingabe.setDisable(false);
        eingabe.setText("");
    }
}
