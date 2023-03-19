package de.sprachkursjava.stadtlandfluss;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;

public class StadtLandFluss extends Application {

    private static Application applicationInstance;
    @Override
    public void start(Stage stage) throws IOException {
        applicationInstance = this;
        FXMLLoader fxmlLoader = new FXMLLoader(StadtLandFluss.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 560, 485);
        //scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setTitle("Stadt, Land, Fluss");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void open_browser(String url) {
        applicationInstance.getHostServices().showDocument(url);
    }
}