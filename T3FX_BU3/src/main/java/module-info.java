module com.example.t3fx_bu3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.t3fx_bu3 to javafx.fxml;
    exports com.example.t3fx_bu3;
}