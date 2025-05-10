package t3FX_LT3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class T3FX_LT3 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public boolean check(TextField t1) {
        if (!t1.getText().isEmpty() && t1.getText().matches("[0-9]*")) {
            return true;
        } else {
            return false;
        }
    }

    public String pow2(TextField t1) {
        try {
            if (check(t1)) {
                int x = Integer.parseInt(t1.getText());
                if (x <= Math.sqrt(Integer.MAX_VALUE)) {
                    return Integer.toString(x * x);
                } else {
                    return "Zu groß";
                }
            } else {
                return "Keine Zahl";
            }
        } catch (NumberFormatException e) {
            return "Fehler";
        }
    }

    public String pow3(TextField t1) {
        try {
            if (check(t1)) {
                int x = Integer.parseInt(t1.getText());
                if (x <= Math.cbrt(Integer.MAX_VALUE)) {
                    return Integer.toString(x * x * x);
                } else {
                    return "Zu groß";
                }
            } else {
                return "Keine Zahl";
            }
        } catch (NumberFormatException e) {
            return "Fehler";
        }
    }


    @Override
    public void start(Stage arg0) {
        int n = 5;

        TextField[] textFields = new TextField[n];
        Label[] lb1 = new Label[n];
        Label[] lb2 = new Label[n];

        Label lb01 = new Label("Zahl");
        Label lb02 = new Label("Quadrat");
        Label lb03 = new Label("Kubik");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15));
        grid.setVgap(10);
        grid.setHgap(10);
        grid.add(lb01, 0, 0);
        grid.add(lb02, 1, 0);
        grid.add(lb03, 2, 0);


        for (int i = 0; i < n; i++) {
            textFields[i] = new TextField();
            textFields[i].setPromptText("Ganze Zahl eingeben:");
            textFields[i].setPrefWidth(140);

            lb1[i] = new Label();
            lb1[i].setPrefWidth(75);

            lb2[i] = new Label();
            lb2[i].setPrefWidth(75);

            grid.add(textFields[i], 0, i + 1);
            grid.add(lb1[i], 1, i + 1);
            grid.add(lb2[i], 2, i + 1);

            int finalI = i;
            textFields[i].setOnAction(e -> {
                lb1[finalI].setText(pow2(textFields[finalI]));
                lb2[finalI].setText(pow3(textFields[finalI]));
            });
        }

        arg0.setScene(new Scene(grid, 450, 250));
        arg0.setTitle("T3FX_LT3");
        arg0.show();
    }
}
