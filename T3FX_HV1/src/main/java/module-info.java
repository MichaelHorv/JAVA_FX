module com.example.t3fx_hv1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.t3fx_hv1 to javafx.fxml;
    exports com.example.t3fx_hv1;
}