package t3fx_lt1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class T3FX_LT1 extends Application {


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage arg0) throws IOException {
        TextField tf1 = new TextField();
        tf1.setBorder(new Border((new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, null, new BorderWidths(2)))));
        TextField tf2 = new TextField();
        tf2.setBorder(new Border((new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, null, new BorderWidths(2)))));
        TextField tf3 = new TextField();
        tf3.setBorder(new Border((new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, null, new BorderWidths(2)))));



        Label lb1 = new Label();
        lb1.setPrefWidth(150);
        lb1.setBorder(new Border((new BorderStroke(Color.RED, BorderStrokeStyle.DASHED, null, new BorderWidths(2)))));
        Label lb2 = new Label();
        lb2.setPrefWidth(150);
        lb2.setBorder(new Border((new BorderStroke(Color.RED, BorderStrokeStyle.DASHED, null, new BorderWidths(2)))));
        Label lb3 = new Label();
        lb3.setPrefWidth(150);
        lb3.setBorder(new Border((new BorderStroke(Color.RED, BorderStrokeStyle.DASHED, null, new BorderWidths(2)))));


        GridPane grid = new GridPane();
        grid.add(tf1, 0, 0);
        grid.add(tf2, 0, 1);
        grid.add(tf3, 0, 2);
        grid.add(lb1, 1, 0);
        grid.add(lb2, 1, 1);
        grid.add(lb3, 1, 2);



        tf1.setOnAction(e -> lb1.setText(tf1.getText()));
        tf2.setOnAction(e -> lb2.setText(tf2.getText()));
        tf3.setOnAction(e -> lb3.setText(tf3.getText()));

        arg0.setScene(new Scene(grid, 450, 250));
        arg0.setTitle("T3FX_LT1");
        arg0.show();

    }
}