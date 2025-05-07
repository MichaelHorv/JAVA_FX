package t3FX_LT3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;



import java.io.IOException;

public class T3FX_LT3 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public String pow2(TextField t1) {
        try {
            if (!t1.getText().isEmpty() && t1.getText().matches("[0-9]*")) {
                int x = Integer.parseInt(t1.getText());
                if (x <= Math.sqrt(Integer.MAX_VALUE)) {
                    return Integer.toString(x * x);
                } else {
                    return "Zu groß";
                }
            } else {
                return "Fehler";
            }
        } catch (NumberFormatException e) {
            return "Fehler";
        }
    }

    public String pow3(TextField t1) {
        try {
            if (!t1.getText().isEmpty() && t1.getText().matches("[0-9]*")) {
                int x = Integer.parseInt(t1.getText());
                if (x <= Math.cbrt(Integer.MAX_VALUE)) {
                    return Integer.toString(x * x * x);
                } else {
                    return "Zu groß";
                }
            } else {
                return "Fehler";
            }
        }
        catch (NumberFormatException e) {
            return "Fehler";
        }
    }


    @Override
    public void start(Stage arg0){
        TextField tf1 = new TextField();
        tf1.setPromptText("Ganze Zahl eingeben:");
        tf1.setPrefWidth(140);
        TextField tf2 = new TextField();
        tf2.setPromptText("Ganze Zahl eingeben:");
        tf2.setPrefWidth(140);
        TextField tf3 = new TextField();
        tf3.setPromptText("Ganze Zahl eingeben:");
        tf3.setPrefWidth(140);
        TextField tf4 = new TextField();
        tf4.setPromptText("Ganze Zahl eingeben:");
        tf4.setPrefWidth(140);
        TextField tf5 = new TextField();
        tf5.setPromptText("Ganze Zahl eingeben:");
        tf5.setPrefWidth(140);

        //HEADER
        Label lb01 = new Label("Zahl");
        Label lb02 = new Label("Quadrat");
        Label lb03 = new Label("Kubik");

        Label lb11 = new Label();
        lb11.setPrefWidth(75);
        Label lb12 = new Label();
        lb12.setPrefWidth(75);
        Label lb13 = new Label();
        lb13.setPrefWidth(75);
        Label lb14 = new Label();
        lb14.setPrefWidth(75);
        Label lb15 = new Label();
        lb15.setPrefWidth(75);


        Label lb21 = new Label();
        lb21.setPrefWidth(75);
        Label lb22 = new Label();
        lb22.setPrefWidth(75);
        Label lb23 = new Label();
        lb23.setPrefWidth(75);
        Label lb24 = new Label();
        lb24.setPrefWidth(75);
        Label lb25 = new Label();
        lb25.setPrefWidth(75);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15));
        grid.setVgap(10);
        grid.setHgap(10);
        grid.add(lb01, 0, 0);
        grid.add(lb02, 1, 0);
        grid.add(lb03, 2, 0);

        grid.add(tf1, 0, 1);
        grid.add(tf2, 0, 2);
        grid.add(tf3, 0, 3);
        grid.add(tf4, 0, 4);
        grid.add(tf5, 0, 5);

        grid.add(lb11, 1, 1);
        grid.add(lb12, 1, 2);
        grid.add(lb13, 1, 3);
        grid.add(lb14, 1, 4);
        grid.add(lb15, 1, 5);

        grid.add(lb21, 2, 1);
        grid.add(lb22, 2, 2);
        grid.add(lb23, 2, 3);
        grid.add(lb24, 2, 4);
        grid.add(lb25, 2, 5);


        tf1.setOnAction(e -> {
            lb11.setText(pow2(tf1));
            lb21.setText(pow3(tf1));
        });

        tf2.setOnAction(e -> {
            lb12.setText(pow2(tf2));
            lb22.setText(pow3(tf2));
        });
        tf3.setOnAction(e -> {
            lb13.setText(pow2(tf3));
            lb23.setText(pow3(tf3));
        });
        tf4.setOnAction(e -> {
            lb14.setText(pow2(tf4));
            lb24.setText(pow3(tf4));
        });
        tf5.setOnAction(e -> {
            lb15.setText(pow2(tf5));
            lb25.setText(pow3(tf5));
        });

        arg0.setScene(new Scene(grid, 450, 250));
        arg0.setTitle("T3FX_LT3");
        arg0.show();
    }
}
