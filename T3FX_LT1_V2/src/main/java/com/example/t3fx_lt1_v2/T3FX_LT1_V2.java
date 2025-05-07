package com.example.t3fx_lt1_v2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class T3FX_LT1_V2 extends Application {


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage arg0) throws IOException {
        GridPane gp = new GridPane();
        gp.setPadding(new Insets(5));
        gp.setHgap(10);
        gp.setVgap(10);

        for (int i = 0; i < 3; i++) {
            TextField tf = new TextField();
            tf.setPrefWidth(150);
            tf.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.DOTTED,
                    null, new BorderWidths(2))));
            Label lb1 = new Label();
            lb1.setPrefWidth(150);
            lb1.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.DASHED,
                    new CornerRadii(5), new BorderWidths(2))));
            gp.add(tf, 0, i);
            gp.add(lb1, 1, i);
            tf.setOnAction(e -> anzeigen(tf, lb1));
        }

        arg0.setScene(new Scene(gp));
        arg0.setTitle("T3FX_LT1_V2");
        arg0.show();
    }

    private void anzeigen(TextField f, Label l) {
        try {
            int z = Integer.parseInt(f.getText());
            l.setText("Zahl" + z);
        } catch (NumberFormatException e) {
            new Alert(Alert.AlertType.ERROR, "Ganze Zahl eingeben").showAndWait();
        }
    }
}