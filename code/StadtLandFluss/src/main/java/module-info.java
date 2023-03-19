module de.sprachkursjava.stadtlandfluss {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens de.sprachkursjava.stadtlandfluss to javafx.fxml;
    exports de.sprachkursjava.stadtlandfluss;
}