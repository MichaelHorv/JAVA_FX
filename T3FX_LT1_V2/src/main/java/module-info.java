module com.example.t3fx_lt1_v2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.t3fx_lt1_v2 to javafx.fxml;
    exports com.example.t3fx_lt1_v2;
}