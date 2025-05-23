package com.example.t3fx_hv1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.net.URI;
import java.nio.file.Path;

public class T3FX_HV1 extends Application {
    @Override
    public void start(Stage arg0){
        Label lblName = new Label("Name");
        lblName.setPrefWidth(120);
        HBox hbName = new HBox(10, lblName, new Label("Lando Norris"));
        hbName.setPadding(new Insets(5));

        Label lblTeam = new Label("Team");
        lblTeam.setPrefWidth(120);
        HBox hbTeam = new HBox(10, lblTeam, new Label("McLaren"));
        hbTeam.setPadding(new Insets(5));

        Label lblAuto = new Label("Auto");
        lblAuto.setPrefWidth(120);
        Label lblBild = new Label();
        URI uri = Path.of("C:\\Users\\Michael\\Desktop\\f1car.jpg").toUri();
        ImageView iv = new ImageView(uri.toString());
        iv.setPreserveRatio(true);
        iv.setFitWidth(400);
        lblBild.setGraphic(iv);
        HBox hbBild = new HBox(10, lblAuto, lblBild);
        hbBild.setPadding(new Insets(5));

        VBox vb = new VBox(10, hbName, hbTeam, hbBild);
        vb.setPadding(new Insets(5));

        arg0.setScene(new Scene(vb));
        arg0.setTitle("T3FX_HV1");
        arg0.show();
    }

    public static void main(String[] args) {
        launch();
    }
}