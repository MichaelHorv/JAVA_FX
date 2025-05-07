package t3fx_wl3;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
public class T3FX_WL3 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        Label lb1 = new Label("Label1");
        Label lb2 = new Label("Label2");
        Label lb3 = new Label("Label3");
        Label lb4 = new Label("Label4");
        Label lb5 = new Label("Label5");
        Label lb6 = new Label("Label6");
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(5));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.add(lb1,0,0);
        grid.add(lb2,1,0);
        grid.add(lb3,0,1);
        grid.add(lb4,1,1);
        grid.add(lb5,0,2);
        grid.add(lb6,1,2);

        RowConstraints rc1 = new RowConstraints();
        rc1.setPercentHeight(100);
        RowConstraints rc2 = new RowConstraints();
        rc2.setPercentHeight(200);
        RowConstraints rc3 = new RowConstraints();
        rc3.setPercentHeight(300);
        grid.getRowConstraints().addAll(rc1,rc2,rc3);


        arg0.setScene(new Scene(grid, 450, 250));
        arg0.setTitle("T3FX_WL3");
        arg0.show();
    }
}



