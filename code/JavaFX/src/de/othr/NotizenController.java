package de.othr;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class NotizenController {
    @FXML ListView<Notiz> uebersicht;
    @FXML TextArea notiztext;
    @FXML TextField notiztitel;
    @FXML Button btn_neu;

    ObservableList<Notiz> notizen
            = FXCollections.observableArrayList();

    public void initialize() {
        uebersicht.setItems(notizen);
    }

    // ... (siehe nächste Folie)

    public void notizNeu(ActionEvent actionEvent) {
        notizen.add(new Notiz(notiztitel.getText()));
        notiztitel.setText("");
    }

    public void notizAuswahl(MouseEvent mouseEvent) {
        Notiz notiz = uebersicht.getSelectionModel().getSelectedItem();
        notiztext.setText(notiz.getText());
    }

    public void notizAendern(KeyEvent keyEvent) {
        Notiz notiz = uebersicht.getSelectionModel().getSelectedItem();
        notiz.setText(notiztext.getText());
    }

    public void notizLoeschen(ActionEvent actionEvent) {
        int i = uebersicht.getSelectionModel().getSelectedIndex();
        notizen.remove(i);
        notiztitel.setText("");
        notiztext.setText("");
    }
}
