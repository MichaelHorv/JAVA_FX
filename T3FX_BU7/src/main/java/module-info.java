module com.example.t3fx_bu7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.t3fx_bu7 to javafx.fxml;
    exports com.example.t3fx_bu7;
}