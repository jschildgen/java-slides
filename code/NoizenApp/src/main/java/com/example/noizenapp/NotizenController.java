package com.example.noizenapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class NotizenController {
    @FXML
    ListView<Notiz> notizen_liste;
    @FXML
    TextField neuer_titel;

    @FXML TextArea notiz_text;


    public void neueNotiz(ActionEvent actionEvent) {
        Notiz notiz = new Notiz(neuer_titel.getText());
        notiz.setText("Hier gibt es nichts zu sehen.");
        notizen_liste.getItems().add(notiz);
        neuer_titel.setText("");
    }

    public void notiz_auswahl(MouseEvent mouseEvent) {
        Notiz notiz = notizen_liste.getFocusModel().getFocusedItem();
        notiz_text.setText(notiz.getText());
    }

    public void notiz_aendern(KeyEvent keyEvent) {
        Notiz notiz = notizen_liste.getFocusModel().getFocusedItem();
        notiz.setText(notiz_text.getText());
    }

    public void notiz_loeschen(ActionEvent actionEvent) {
        int selected_item = notizen_liste.getFocusModel().getFocusedIndex();
        if(selected_item < 0) {
            return;
        }
        notizen_liste.getItems().remove(selected_item);

    }
}