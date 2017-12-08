/*
   Author: Camila Arbaiza

   Professor: Tanes Kanchanawanchai

   Problem 15.4

   (Create a simple calculator) Write a program to perform addition, subtraction,
   multiplication, and division, as shown in Figure 15.25a.

 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Assigment15 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {


        //Create FlowPane
        FlowPane pane = new FlowPane();
        pane.setHgap(2);          //Set spacing

        //Create TextFields
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();

        //Set preferred column count for text fields
        tf1.setPrefColumnCount(3);
        tf2.setPrefColumnCount(3);
        tf3.setPrefColumnCount(3);

        //Add all test field to the pane and label them
        pane.getChildren().addAll(new Label("Number 1: "), tf1,
                new Label("Number 2: "), tf2,
                new Label("Result: "), tf3);

        //Create a horizontal box to put buttons in
        HBox hbox = new HBox(5);
        Button add = new Button("Add");
        Button subtract = new Button("Subtract");
        Button multiply = new Button("Multiply");
        Button divide = new Button("Divide");

        hbox.setAlignment(Pos.CENTER);      //set alignment of the hbox
        hbox.getChildren().addAll(add, subtract, multiply, divide);  // add buttons to the hbox

        //Create BorderPane
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hbox);

        //Create scene
        Scene scene = new Scene(borderPane, 400, 100);
        primaryStage.setTitle("Exercise15_04");
        primaryStage.setScene(scene);
        primaryStage.show();

        //Create action for when the buttons "add, subtract, multiply, and divide" are used

        add.setOnAction(e -> {

            tf3.setText((Double.parseDouble(tf1.getText())+Double.parseDouble(tf2.getText())) + " ");
        });

        subtract.setOnAction(e -> {

            tf3.setText(Double.parseDouble(tf1.getText()) -
                    Double.parseDouble(tf2.getText()) + " ");
        });

        multiply.setOnAction(e -> {

            tf3.setText(Double.parseDouble(tf1.getText()) *
                    Double.parseDouble(tf2.getText()) + " ");
        });

        divide.setOnAction(e -> {

            tf3.setText((Double.parseDouble(tf1.getText())/Double.parseDouble(tf2.getText())) + " ");
        });
    }
}
