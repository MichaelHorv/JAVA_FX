module com.example.t3fx_bu8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.t3fx_bu8 to javafx.fxml;
    exports com.example.t3fx_bu8;
}