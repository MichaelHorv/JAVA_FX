package com.example.t3fx_bu8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.DecimalFormat;

public class T3FX_BU8 extends Application {


    private Double sum = 0.0;
    private DecimalFormat df = new DecimalFormat("#.00");
    private Label l1 = new Label("Gesamtpreis: 0");


    @Override
    public void start(Stage arg0) throws IOException {

        RadioButton radio1gr1 = new RadioButton("Kaffee (3,20 Euro)");
        RadioButton radio2gr1 = new RadioButton("Tee (2,90 Euro)");
        RadioButton radio3gr1 = new RadioButton("Kein Getränk");
        CheckBox checkBox1 = new CheckBox("Croissant (1,90 Euro)");
        CheckBox checkBox2 = new CheckBox("Semmel (0,80 Euro)");
        CheckBox checkBox3 = new CheckBox("Marmelade und Butter (2,50 Euro)");
        RadioButton radio1gr2 = new RadioButton("frischgepresster Orangensaft (3,50 Euro)");
        RadioButton radio2gr2 = new RadioButton("Sekt Orange (5,50 Euro)");
        RadioButton radio3gr2 = new RadioButton("Kein Getränk");


        ToggleGroup group = new ToggleGroup();
        group.getToggles().add(radio1gr1);
        group.getToggles().add(radio2gr1);
        group.getToggles().add(radio3gr1);

        ToggleGroup group2 = new ToggleGroup();
        group2.getToggles().add(radio1gr2);
        group2.getToggles().add(radio2gr2);
        group2.getToggles().add(radio3gr2);

        HBox hbox1 = new HBox(radio1gr1, radio2gr1, radio3gr1);
        hbox1.setSpacing(10);
        HBox hbox2 = new HBox(checkBox1);
        HBox hbox3 = new HBox(checkBox2);
        HBox hbox4 = new HBox(checkBox3);
        HBox hbox5 = new HBox(radio1gr2, radio2gr2, radio3gr2);
        hbox5.setSpacing(10);
        HBox hbox6 = new HBox(l1);

        VBox vbox = new VBox(hbox1, hbox2, hbox3, hbox4, hbox5, hbox6);
        vbox.setSpacing(20);
        vbox.setPadding(new Insets(10));

        group.selectedToggleProperty().addListener((obs, oldToggle, newToggle) -> {
            if (newToggle == radio1gr1) {
                setLabel(sum += 3.2);
            } else if (oldToggle == radio1gr1) {
                setLabel(sum -= 3.2);
            }
            if (newToggle == radio2gr1) {
                setLabel(sum += 2.9);
            } else if (oldToggle == radio2gr1) {
                setLabel(sum -= 2.9);
            }
        });

        checkBox1.onActionProperty().set(event -> {
            if (checkBox1.isSelected()) {
                setLabel(sum += 1.9);
            } else {
                setLabel(sum -= 1.9);
            }
        });

        checkBox2.onActionProperty().set(event -> {
            if (checkBox2.isSelected()) {
                setLabel(sum += 0.8);
            } else {
                setLabel(sum -= 0.8);
            }
        });
        checkBox3.onActionProperty().set(event -> {
            if (checkBox3.isSelected()) {
                setLabel(sum += 2.5);
            } else {
                setLabel(sum -= 2.5);
            }
        });

        group2.selectedToggleProperty().addListener((obs, oldToggle, newToggle) -> {
            if (newToggle == radio1gr2) {
                setLabel(sum += 3.5);
            } else if (oldToggle == radio1gr2) {
                setLabel(sum -= 3.5);
            }
            if (newToggle == radio2gr2) {
                setLabel(sum += 5.5);
            } else if (oldToggle == radio2gr2) {
                setLabel(sum -= 5.5);
            }
        });

        arg0.setScene(new Scene(vbox));
        arg0.setTitle("T3FX_BU8");
        arg0.show();
    }

    private void setLabel(double sum) {
        if (sum <= 0.00) {
            l1.setText("Gesamtpreis: " + 0);
        } else if (sum <= 1.00 && sum > Double.MIN_VALUE) {
            l1.setText("Gesamtpreis: " + 0 + df.format(sum));
        } else {
            l1.setText("Gesamtpreis: " + df.format(sum));
        }
    }

    public static void main(String[] args) {
        launch();
    }
}