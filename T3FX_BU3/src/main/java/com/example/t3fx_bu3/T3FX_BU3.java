package com.example.t3fx_bu3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class T3FX_BU3 extends Application {

    private CheckBox cb1 = new CheckBox("CB1");
    private CheckBox cb2 = new CheckBox("CB2");
    private Label l1 = new Label();

    @Override
    public void start(Stage arg0) throws IOException {

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10));
        grid.setPrefSize(280, 50);

        cb1.allowIndeterminateProperty().set(true);

        cb1.onActionProperty().set(event -> {
            auswahlErmitteln();
        });
        cb2.onActionProperty().set(event -> {
            auswahlErmitteln();
        });

        grid.add(l1, 2, 1);
        grid.add(cb1, 0, 2);
        grid.add(cb2, 1, 2);
        arg0.setScene(new Scene(grid));
        arg0.show();
    }

    private void auswahlErmitteln() {
        String s = "";
        if (cb1.isSelected()) {
            s = "CB1 An";
        } else if (cb1.isIndeterminate()) {
            s = "CB1 Indeterminate";
        }

        if (cb2.isSelected()) {
            if (!s.isEmpty()) {
                s += ", CB2 An";
            } else {
                s += "CB2 An";
            }

        }
        l1.setText(s);
    }

    public static void main(String[] args) {
        launch();
    }
}