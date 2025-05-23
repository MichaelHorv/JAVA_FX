package com.example.t3fx_bu2;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class T3FX_BU2 extends Application {
    @Override
    public void start(Stage arg0) throws IOException {

        Label l1 = new Label("Geschlecht wählen:");
        Label l2 = new Label("Männlich");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPrefWidth(300);

        ToggleGroup group = new ToggleGroup();
        RadioButton r1 = new RadioButton("M");
        RadioButton r2 = new RadioButton("W");
        RadioButton r3 = new RadioButton("D");

        r1.setToggleGroup(group);
        r2.setToggleGroup(group);
        r3.setToggleGroup(group);

        r1.setSelected(true);

//        r1.setOnAction(e -> {
//            l2.setText("Männlich");
//        });
//        r2.setOnAction(e -> {
//            l2.setText("Weiblich");
//        });
//        r3.setOnAction(e -> {
//            l2.setText("Divers");
//        });

//        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
//            @Override
//            public void changed(ObservableValue<? extends Toggle> observableValue, Toggle toggle, Toggle t1) {
//                if (r1.isSelected()) {
//                    l2.setText("Männlich");
//                } else if (r2.isSelected()) {
//                    l2.setText("Weiblich");
//                } else if (r3.isSelected()) {
//                    l2.setText("Divers");
//                }
//            }
//        });

        group.selectedToggleProperty().addListener((p0, p1, p2) -> {
            if (r1.isSelected()) {
                l2.setText("Männlich");
            } else if (r2.isSelected()) {
                l2.setText("Weiblich");
            } else if (r3.isSelected()) {
                l2.setText("Divers");
            }
        });

        grid.add(l1, 0, 0);
        grid.add(l2, 0, 1);
        grid.add(r1, 0, 2);
        grid.add(r2, 1, 2);
        grid.add(r3, 2, 2);

        arg0.setScene(new Scene(grid));
        arg0.setTitle("T3FX_BU2");
        arg0.show();
    }

    public static void main(String[] args) {
        launch();
    }
}