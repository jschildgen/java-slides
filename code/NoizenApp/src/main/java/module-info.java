module com.example.noizenapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.noizenapp to javafx.fxml;
    exports com.example.noizenapp;
}