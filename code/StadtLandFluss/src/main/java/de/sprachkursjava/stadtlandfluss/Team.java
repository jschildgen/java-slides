package de.sprachkursjava.stadtlandfluss;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Team {
    public static final int NUM_TEXTS = 3;
    private static int next_id = 1;

    private int id;

    private TextField[] textFields = new TextField[NUM_TEXTS];
    private Label pointsLabel;

    public Team() {
        this.id = next_id++;
    }

    public int getId() {
        return id;
    }

    public TextField[] getTextFields() {
        return textFields;
    }
    public Label getPointsLabel() {
        return pointsLabel;
    }

    public void setPointsLabel(Label pointsLabel) {
        this.pointsLabel = pointsLabel;
    }
}
