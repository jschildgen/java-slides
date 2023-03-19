package de.sprachkursjava.stadtlandfluss;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Controller {
    @FXML TextField regex;
    @FXML VBox teams_vbox;

    List<Team> teams;

    TextField lastFocuseField = null;

    public void initialize() {
        teams = new LinkedList<>();
        for(int i = 1; i <= 20; i++) {
            teams.add(new Team());
        }

        regex.setText("[A-Z][^i]+[ar]");

        refresh_teams();
    }

    private void refresh_teams() {
        teams_vbox.getChildren().clear();
        for(Team team : teams) {
            Label teamLabel = new Label(""+team.getId());
            teamLabel.setMinWidth(20);
            HBox hbox = new HBox(teamLabel);
            for(int i = 0; i < Team.NUM_TEXTS; i++) {
                TextField textField = new TextField();
                textField.setOnKeyReleased((keyEvent -> checkText(keyEvent)));
                textField.focusedProperty().addListener((observable, oldVal, newVal) -> {
                            if(newVal) { lastFocuseField = textField; }
                        });
                hbox.getChildren().add(textField);
                team.getTextFields()[i] = textField;
            }
            Label pointsLabel = new Label("0");
            hbox.getChildren().add(pointsLabel);
            team.setPointsLabel(pointsLabel);

            hbox.setAlignment(Pos.CENTER_LEFT);
            teams_vbox.getChildren().add(hbox);
        }
    }

    private void checkText(KeyEvent keyEvent) {
        for(Team team : teams) {
            int points = 0;
            for(int i = 0; i < Team.NUM_TEXTS; i++) {
                TextField textField = team.getTextFields()[i];

                if(textField == null || textField.getText() == null || textField.getText().isBlank()) {
                    textField.setStyle("");
                    continue;
                }

                if(!textField.getText().matches(regex.getText())) {
                    textField.setStyle("-fx-background-color: red");
                    continue;
                }

                int finalI = i;
                long count = teams.stream().map(t -> t.getTextFields()[finalI].getText())
                                           .filter(s -> s.equals(textField.getText())).count();
                if(count == 1) {
                    textField.setStyle("-fx-background-color: green");
                    points += 2;
                    continue;
                }

                points += 1;
                textField.setStyle("-fx-background-color: yellow");
            }
            team.getPointsLabel().setText(""+points);
        }
    }

    public void wikipedia(ActionEvent actionEvent) {
        StadtLandFluss.open_browser("https://de.wikipedia.org/wiki/"+lastFocuseField.getText().replaceAll("\\s","+"));
    }
}