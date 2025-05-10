module com.example.pruefung {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pruefung to javafx.fxml;
    exports com.example.pruefung;
}