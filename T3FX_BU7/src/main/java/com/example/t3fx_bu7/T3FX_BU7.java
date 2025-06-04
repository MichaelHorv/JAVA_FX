package com.example.t3fx_bu7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class T3FX_BU7 extends Application {
    private Button b1 = new Button("Zahl verdoppeln");
    private Button b2 = new Button("Zahl quadrieren");
    private Button b3 = new Button("Quadratwurzel ziehen");

    @Override
    public void start(Stage arg0) throws IOException {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        Label l1 = new Label("Zahl");
        TextField tf1 = new TextField();
        Label l2 = new Label("Ergebnis: ");


        b1.setOnAction(e -> {
            try {
                double zahl = Double.parseDouble(tf1.getText());
                zahl = zahl * 2;
                l2.setText("Ergebnis: " + zahl);

            } catch (NumberFormatException ex) {
                l2.setText("Fehler");
            }
        });

        b2.setOnAction(e -> {
            try {
                double zahl = Double.parseDouble(tf1.getText());
                zahl = Math.pow(zahl, 2);
                l2.setText("Ergebnis: " + zahl);

            } catch (NumberFormatException ex) {
                l2.setText("Fehler");
            }
        });

        b3.setOnAction(e -> {
            try {
                double zahl = Double.parseDouble(tf1.getText());
                double ergebnis = Math.sqrt(zahl);
                l2.setText("Ergebnis: " + ergebnis);

            } catch (NumberFormatException ex) {
                l2.setText("Fehler");
            }

        });

        grid.add(l1, 0, 0);
        grid.add(tf1, 1, 0);
        grid.add(b1, 0, 1);
        grid.add(b2, 1, 1);
        grid.add(b3, 2, 1);
        grid.add(l2, 0, 2);


        arg0.setScene(new Scene(grid));
        arg0.show();
    }

    public static void main(String[] args) {
        launch();
    }
}