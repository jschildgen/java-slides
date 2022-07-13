module com.example.taschenrechner {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.taschenrechner to javafx.fxml;
    exports com.example.taschenrechner;
}